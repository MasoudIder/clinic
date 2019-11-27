package spring.pet.clinic.repositories;

import org.springframework.data.repository.CrudRepository;
import spring.pet.clinic.model.Speciality;

public interface SpecialtyRepository extends CrudRepository<Speciality,Integer> {
}
