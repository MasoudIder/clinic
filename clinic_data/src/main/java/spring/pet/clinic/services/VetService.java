package spring.pet.clinic.services;

import spring.pet.clinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(int id);

    Vet save(Vet vet);

    Set<Vet> findAll();

}
