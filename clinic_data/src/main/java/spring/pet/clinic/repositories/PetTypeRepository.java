package spring.pet.clinic.repositories;

import org.springframework.data.repository.CrudRepository;
import spring.pet.clinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType,Integer> {
}
