package tr.kkarakamis.dtedelevationdb.entity;

import javax.persistence.*;

@Entity
@Table(name = "grid", schema ="Elevation") //This table holds and grid coordinates and their elev value
public class Grid {

    @EmbeddedId
    IdGrid id;

    @Column
    int elevationValue;

    public Grid() {
    }

    public Grid(IdGrid id, int elevationValue) {
        this.id = id;
        this.elevationValue = elevationValue;
    }


    public int getElevationValue() {
        return elevationValue;
    }

    public void setElevationValue(int elevationValue) {
        this.elevationValue = elevationValue;
    }

}





//
//@Entity
//@Table(name = "htky_grid")
//public class Grid {
//
//    @EmbeddedId
//    IdObject idLongLat;
//
//    @Column
//    private int elevationValue;
//
//    public Grid() {
//    }
//
//    public Grid(int x, int y, int elevationValue) {
//        this.idLongLat = new IdObject(x,y);
//        this.elevationValue = elevationValue;
//    }
//
//
//    public int getElevationValue() {
//        return elevationValue;
//    }
//
//    public void setElevationValue(int elevationValue) {
//        this.elevationValue = elevationValue;
//    }
//
//}
