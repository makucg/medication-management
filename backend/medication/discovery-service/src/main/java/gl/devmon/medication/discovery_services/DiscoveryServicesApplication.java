package gl.devmon.medication.discovery_services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiscoveryServicesApplication.class, args);
    }

}
