package spring.pet.clinic.repositories;

import org.springframework.data.repository.CrudRepository;
import spring.pet.clinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet,Integer> {
}
