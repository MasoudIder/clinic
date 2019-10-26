package spring.pet.clinic.services.map;

import spring.pet.clinic.model.Vet;
import spring.pet.clinic.services.CrudService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet,Integer> implements CrudService<Vet,Integer>{

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Integer id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void delete(Vet object) {
        delete(object);
    }

    @Override
    public void deleteById(Integer id) {
        deleteById(id);
    }
}
