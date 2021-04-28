package tr.tubitak.gov.tr.elevationservice.entitiy;


//import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
@Table(name= "htky_grid", schema = "Elevation")
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
