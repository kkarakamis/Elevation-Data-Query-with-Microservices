package tr.tubitak.gov.tr.elevationservice.entitiy;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class IdGrid implements Serializable {
    @Column
    int id;

    @Column
    int x;

    @Column
    int y;

    public IdGrid(int id, int x, int y) {
        this.id = id;
        this.x = x;
        this.y = y;
    }

    public IdGrid() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IdGrid)) return false;
        IdGrid idGrid = (IdGrid) o;
        return id == idGrid.id &&
                x == idGrid.x &&
                y == idGrid.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, x, y);
    }
}
