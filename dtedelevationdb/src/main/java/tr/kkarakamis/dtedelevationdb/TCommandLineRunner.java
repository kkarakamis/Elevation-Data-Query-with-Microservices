package tr.kkarakamis.dtedelevationdb;

import DtedData.Dted;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import tr.gov.tubitak.utils.dtedelevationdb.entity.*;
import tr.kkarakamis.dtedelevationdb.repos.TElevationRepo;
import tr.kkarakamis.dtedelevationdb.repos.TBorderRepo;
import tr.kkarakamis.dtedelevationdb.entity.Border;
import tr.kkarakamis.dtedelevationdb.entity.Grid;
import tr.kkarakamis.dtedelevationdb.entity.IdBorder;
import tr.kkarakamis.dtedelevationdb.entity.IdGrid;

import java.util.ArrayList;

@Component
public class TCommandLineRunner implements CommandLineRunner {

    @Autowired
    TElevationRepo repogrid;

    @Autowired
    TBorderRepo repoborder;

    @Override
    public void run(String... args) throws Exception {

        Dted dted_data = new Dted("src/main/resources/dataset");
        //this directory should point folder of dataset

        //According to border array, prints message to screen for information
        ArrayList<ArrayList<Integer>> borders = dted_data.getBorders();
        for (int i = 0; i < borders.size(); i++) {
            System.out.println(borders.get(i).get(0) + "  " + borders.get(i).get(2) + "  " + borders.get(i).get(1) + "  "
                    + borders.get(i).get(3) + "  ");
        }
        ArrayList<int[][]> gridList = dted_data.getElevationGrids();

        //for every grid value, add to list and save them to db
        for (int order=0; order<borders.size();order++){
            ArrayList<Grid> gridArrayList = new ArrayList<Grid>(gridList.get(order).length*gridList.get(order)[0].length);
            Border current = new Border(new IdBorder(borders.get(order).get(0),borders.get(order).get(1),
                    borders.get(order).get(2),borders.get(order).get(3)),order,borders.get(order).get(4),borders.get(order).get(5));
            repoborder.save(current);

            for(int i=0;i<gridList.get(order).length;i++){
                for (int j=0; j<gridList.get(order)[0].length;j++){
                    Grid newgrid = new Grid(new IdGrid(order,i,j),gridList.get(order)[i][j]);
                    gridArrayList.add(newgrid);
                }
            }
            repogrid.saveAll(gridArrayList);
            System.out.println("File number: "+order+1);
            System.out.println(" saved to DB");
        }

        System.out.println("All files saved to DB succesfully");

    }
}
