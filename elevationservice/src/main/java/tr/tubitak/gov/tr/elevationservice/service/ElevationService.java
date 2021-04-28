package tr.tubitak.gov.tr.elevationservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tr.tubitak.gov.tr.elevationservice.entitiy.Border;
import tr.tubitak.gov.tr.elevationservice.entitiy.IdBorder;
import tr.tubitak.gov.tr.elevationservice.repos.BorderQueryRepo;
import tr.tubitak.gov.tr.elevationservice.repos.ElevationValueQueryRepo;

import java.util.ArrayList;

@Service
public class ElevationService implements ServiceB,ServiceG{

    @Autowired
    private BorderQueryRepo borderrepo;

    @Autowired
    private ElevationValueQueryRepo elevrepo;

    @Override
    public Integer findByBorder(int longitude , int latitude) {     //This method gets border id from database and
        ArrayList<Border> borderArrayList = borderrepo.findByBorder(longitude, latitude);   //calculates the grid places
        if(borderArrayList.size()>0){                                                       //gets data from DB
            Border current = borderArrayList.get(0);
            IdBorder tempidborder = current.getIdCornerPoint();
            int x = ((longitude-tempidborder.getSw_long())*(current.getTotal_long_line()-1)/
                    (tempidborder.getNe_long()-tempidborder.getSw_long()));
            int y = ((latitude-tempidborder.getSw_lat())*(current.getTotal_lat_line()-1)/
                    (tempidborder.getNe_lat()-tempidborder.getSw_lat()));
            return findElevValue(borderArrayList.get(0).getIdGrid(),x,y);
        } else{
            return -999999; //null value
        }
    }

    @Override
    public Integer findElevValue(int gridid, int x, int y) {
        return this.elevrepo.findElevValue(gridid,x,y);
    }
}

