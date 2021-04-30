package tr.kkarakamis.elevationservice.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tr.kkarakamis.elevationservice.entitiy.Border;
import tr.kkarakamis.elevationservice.entitiy.IdBorder;

import java.util.ArrayList;

public interface BorderQueryRepo extends JpaRepository<Border, IdBorder> {

    @Query("Select u from Border u where( u.idCornerPoint.sw_lat <= ?2 and u.idCornerPoint.sw_long <= ?1 and" +
            " u.idCornerPoint.ne_lat >= ?2 and u.idCornerPoint.ne_long >= ?1)")
    ArrayList<Border> findByBorder(int longitude , int latitude);

//    @Query("Select idGrid from Border u where( u.idCornerPoint.sw_lat < ?1 and u.idCornerPoint.sw_long< ?2 and" +
//            " u.idCornerPoint.ne_lat > ?1 and u.idCornerPoint.ne_long > ?2)")
//    int findByBorder(int latitude, int longitude);
//
//    @Query("Select total_lat_line from Border u where( u.idCornerPoint.sw_lat < ?1 and u.idCornerPoint.sw_long< ?2 and" +
//            " u.idCornerPoint.ne_lat > ?1 and u.idCornerPoint.ne_long > ?2)")
//    int findTotalLatLine(int latitude, int longitude);
}

//@Query("Select elev from Border u where( u.idCornerPoint.sw_lat <= ?1 and u.idCornerPoint.sw_long <= ?2 and" +
//        " u.idCornerPoint.ne_lat >= ?1 and u.idCornerPoint.ne_long >= ?2)")

//    select elevation_value from Grid g where(g.id = u.idGrid where(select u fromBorder u where( u.idCornerPoint.sw_lat <= ?1 and u.idCornerPoint.sw_long <= ?2 and" +
//            " u.idCornerPoint.ne_lat >= ?1 and u.idCornerPoint.ne_long >= ?2))
