package tr.kkarakamis.dtedelevationdb.repos;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import tr.kkarakamis.dtedelevationdb.entity.Border;
import tr.kkarakamis.dtedelevationdb.entity.IdBorder;

@Repository
public interface TBorderRepo extends JpaRepository<Border, IdBorder>{
}
