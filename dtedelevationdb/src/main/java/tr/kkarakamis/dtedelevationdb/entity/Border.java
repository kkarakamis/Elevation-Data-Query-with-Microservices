package tr.kkarakamis.dtedelevationdb.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "elev_border", schema = "Elevation")     //This table holds every grid and their borders and id's for reaching
public class Border {
    @EmbeddedId
    IdBorder idCornerPoint;

    @Column
    int idGrid;

    @Column
    int total_long_line;

    @Column
    int total_lat_line;

    public Border(){};

    public Border(IdBorder idCornerPoint, int idGrid, int total_long_line , int total_lat_line) {
        this.idCornerPoint = idCornerPoint;
        this.idGrid = idGrid;
        this.total_lat_line = total_lat_line;
        this.total_long_line = total_long_line;
    }

}
