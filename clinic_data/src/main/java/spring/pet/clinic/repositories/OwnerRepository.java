package spring.pet.clinic.repositories;

import org.springframework.data.repository.CrudRepository;
import spring.pet.clinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner,Integer> {

    Owner findByLastName(String lastName);

}
