package spring.pet.clinic.services.map;

import spring.pet.clinic.model.Pet;
import spring.pet.clinic.services.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet,Integer> implements CrudService<Pet,Integer> {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Integer id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Integer id) {
        super.deleteById(id);
    }
}
