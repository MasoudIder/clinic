package spring.pet.clinic.repositories;

import org.springframework.data.repository.CrudRepository;
import spring.pet.clinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit,Integer> {
}
