package tr.tubitak.gov.tr.elevationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ElevationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElevationServiceApplication.class, args);
	}

}
