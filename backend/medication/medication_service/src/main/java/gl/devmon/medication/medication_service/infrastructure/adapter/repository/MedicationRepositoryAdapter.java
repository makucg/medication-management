package gl.devmon.medication.medication_service.infrastructure.adapter.repository;

import gl.devmon.medication.medication_service.application.port.out.MedicationRepositoryPort;
import gl.devmon.medication.medication_service.domain.model.Medication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MedicationRepositoryAdapter implements MedicationRepositoryPort {
    private final JpaMedicationRepository jpaMedicationRepository;

    @Autowired
    public MedicationRepositoryAdapter(JpaMedicationRepository jpaMedicationRepository) {
        this.jpaMedicationRepository = jpaMedicationRepository;
    }

    @Override
    public Medication save(Medication medication) {
        return jpaMedicationRepository.save(medication);
    }

    @Override
    public Optional<Medication> findById(Long id) {
        return jpaMedicationRepository.findById(id);
    }

    @Override
    public List findAll() {
        return jpaMedicationRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        jpaMedicationRepository.deleteById(id);
    }

}