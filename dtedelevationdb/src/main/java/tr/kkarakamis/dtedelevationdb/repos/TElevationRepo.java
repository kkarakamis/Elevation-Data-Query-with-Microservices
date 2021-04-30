package tr.kkarakamis.dtedelevationdb.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.kkarakamis.dtedelevationdb.entity.Grid;
import tr.kkarakamis.dtedelevationdb.entity.IdGrid;


@Repository
public interface TElevationRepo extends JpaRepository<Grid, IdGrid>{
}