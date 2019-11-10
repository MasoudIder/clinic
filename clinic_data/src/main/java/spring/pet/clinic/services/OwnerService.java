package spring.pet.clinic.services;

import spring.pet.clinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Integer> {

    Owner findByLastName(String lastName);

}
