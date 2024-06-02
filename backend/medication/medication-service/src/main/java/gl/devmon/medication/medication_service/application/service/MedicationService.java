package gl.devmon.medication.medication_service.application.service;

import gl.devmon.medication.medication_service.application.dto.MedicationDTO;
import gl.devmon.medication.medication_service.application.port.in.MedicationUseCase;
import gl.devmon.medication.medication_service.application.port.out.MedicationRepositoryPort;
import gl.devmon.medication.medication_service.domain.model.Medication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class MedicationService implements MedicationUseCase {

    @Autowired
    private MedicationRepositoryPort medicationRepositoryPort;

    @Override
    public Medication addMedication(MedicationDTO medicationDTO) {
        Medication medication = new Medication();
        medication.setName(medicationDTO.getName());
        medication.setDose(medicationDTO.getDose());
        medication.setFrequency(medicationDTO.getFrequency());
        medication.setSchedules(medicationDTO.getSchedules());
        medication.setStatus(medicationDTO.getStatus());
        medication.setCreatedAt(LocalDateTime.now());
        medication.setUpdatedAt(LocalDateTime.now());
        return medicationRepositoryPort.save(medication);
    }

    @Override
    public Optional<Medication> getMedicationById(Long id) {
        return medicationRepositoryPort.findById(id);
    }

    @Override
    public List<Medication> getAllMedications() {
        return medicationRepositoryPort.findAll();
    }

    @Override
    public void deleteMedicationById(Long id) {
        medicationRepositoryPort.deleteById(id);
    }

    @Override
    public Medication updateMedication(Long id, MedicationDTO medicationDTO) {
        Medication medication = medicationRepositoryPort.findById(id)
                .orElseThrow(() -> new RuntimeException("Medication not found"));
        medication.setName(medicationDTO.getName());
        medication.setDose(medicationDTO.getDose());
        medication.setFrequency(medicationDTO.getFrequency());
        medication.setSchedules(medicationDTO.getSchedules());
        medication.setStatus(medicationDTO.getStatus());
        medication.setUpdatedAt(LocalDateTime.now());
        return medicationRepositoryPort.save(medication);
    }
}