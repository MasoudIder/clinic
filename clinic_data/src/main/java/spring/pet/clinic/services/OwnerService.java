package spring.pet.clinic.services;

import spring.pet.clinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findById(int id);

    Owner findByLastName(String lastName);

    Owner save(Owner owner);

    Set<Owner> findAll();

}
