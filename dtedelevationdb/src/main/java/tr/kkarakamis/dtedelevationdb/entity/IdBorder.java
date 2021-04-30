package tr.kkarakamis.dtedelevationdb.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class IdBorder implements Serializable {
    @Column
    int sw_long;
    @Column
    int sw_lat;
    @Column
    int ne_long;
    @Column
    int ne_lat;


    public IdBorder(int sw_long, int sw_lat, int ne_long, int ne_lat) {
        this.sw_long = sw_long;
        this.sw_lat = sw_lat;
        this.ne_long = ne_long;
        this.ne_lat = ne_lat;
    }

    public IdBorder() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IdBorder)) return false;
        IdBorder idBorder = (IdBorder) o;
        return sw_long == idBorder.sw_long &&
                sw_lat == idBorder.sw_lat &&
                ne_long == idBorder.ne_long &&
                ne_lat == idBorder.ne_lat;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sw_long, sw_lat, ne_long, ne_lat);
    }
}