package gl.devmon.medication.medication_service.infrastructure.adapter.repository;

import gl.devmon.medication.medication_service.domain.model.Medication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaMedicationRepository extends JpaRepository<Medication, Long> {
}