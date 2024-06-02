package gl.devmon.medication.medication_service.application.port.in;

import gl.devmon.medication.medication_service.application.dto.MedicationDTO;
import gl.devmon.medication.medication_service.domain.model.Medication;
import java.util.List;
import java.util.Optional;

public interface MedicationUseCase {
    Medication addMedication(MedicationDTO medication);
    Optional<Medication> getMedicationById(Long id);
    List<Medication> getAllMedications();
    void deleteMedicationById(Long id);
    Medication updateMedication(Long id, MedicationDTO medication);
}