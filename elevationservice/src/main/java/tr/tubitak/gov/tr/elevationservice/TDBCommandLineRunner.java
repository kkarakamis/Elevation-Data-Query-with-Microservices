package tr.tubitak.gov.tr.elevationservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import tr.tubitak.gov.tr.elevationservice.repos.BorderQueryRepo;
import tr.tubitak.gov.tr.elevationservice.repos.ElevationValueQueryRepo;


@Component
public class TDBCommandLineRunner implements CommandLineRunner {

    @Autowired
    BorderQueryRepo repoborder;

    @Autowired
    ElevationValueQueryRepo repogrid;

    @Override
    public void run(String... args) throws Exception {

    }
}
