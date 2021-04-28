package tr.tubitak.gov.tr.elevationservice.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tr.tubitak.gov.tr.elevationservice.entitiy.Grid;
import tr.tubitak.gov.tr.elevationservice.entitiy.IdGrid;

public interface ElevationValueQueryRepo extends JpaRepository<Grid, IdGrid> {
    @Query("Select elevationValue from Grid u where (u.id.id = ?1 and u.id.x = ?2 and u.id.y = ?3)")
    Integer findElevValue(int tableid, int x, int y);
}

