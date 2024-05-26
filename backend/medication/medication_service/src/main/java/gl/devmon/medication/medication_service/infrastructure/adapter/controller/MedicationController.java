package gl.devmon.medication.medication_service.infrastructure.adapter.controller;

import gl.devmon.medication.medication_service.application.dto.MedicationDTO;
import gl.devmon.medication.medication_service.application.port.in.MedicationUseCase;
import gl.devmon.medication.medication_service.domain.model.Medication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/medications")
public class MedicationController {
    @Autowired
    private MedicationUseCase medicationUseCase;

    @PostMapping("/add")
    public ResponseEntity<Medication> addMedication(@RequestBody MedicationDTO medicationDTO) {
        Medication newMedication = medicationUseCase.addMedication(medicationDTO);
        return ResponseEntity.ok(newMedication);
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<Medication> editMedication(@PathVariable Long id, @RequestBody MedicationDTO medicationDTO) {
        Medication updatedMedication = medicationUseCase.updateMedication(id, medicationDTO);
        return ResponseEntity.ok(updatedMedication);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteMedication(@PathVariable Long id) {
        medicationUseCase.deleteMedicationById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/all")
    public ResponseEntity<List<Medication>> getAllMedications() {
        List<Medication> medications = medicationUseCase.getAllMedications();
        return ResponseEntity.ok(medications);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Medication> getMedicationById(@PathVariable Long id) {
        return medicationUseCase.getMedicationById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}