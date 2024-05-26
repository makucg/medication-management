package gl.devmon.medication.medication_service.application.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MedicationDTO {
    private String name;
    private String dose;
    private String frequency;
    private String schedules;
    private String status;
}