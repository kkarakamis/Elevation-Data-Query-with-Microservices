package tr.tubitak.gov.tr.elevationservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;
import tr.tubitak.gov.tr.elevationservice.model.ReturnOfElModel;
import tr.tubitak.gov.tr.elevationservice.service.ElevationService;


@RestController
public class ElevationController {
    @Autowired
    private ElevationService bservice;

    @GetMapping(value = "/elevation",produces = MediaType.APPLICATION_JSON_VALUE)
    public ReturnOfElModel borderQuery(@RequestParam("longitude") int longitude, @RequestParam("latitude") int latitude) {
        return  new ReturnOfElModel(bservice.findByBorder(longitude ,latitude));
    }

}
