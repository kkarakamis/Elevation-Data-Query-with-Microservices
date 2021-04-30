package tr.kkarakamis.elevationservice.entitiy;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "htky_elev_border", schema = "Elevation")
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

    public int getIdGrid() {
        return idGrid;
    }

    public int getTotal_lat_line() {
        return total_lat_line;
    }

    public int getTotal_long_line() {
        return total_long_line;
    }

    public IdBorder getIdCornerPoint() {
        return idCornerPoint;
    }
}