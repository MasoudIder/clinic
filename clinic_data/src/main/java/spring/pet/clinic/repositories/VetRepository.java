package spring.pet.clinic.repositories;

import org.springframework.data.repository.CrudRepository;
import spring.pet.clinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet,Integer> {
}
