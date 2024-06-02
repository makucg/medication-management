package gl.devmon.medication.medication_service;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(title = "Medication Service API", version = "1.0", description = "Documentation Medication Service API v1.0")
)
public class MedicationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MedicationServiceApplication.class, args);
    }

}
