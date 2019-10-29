package spring.pet.clinic.services.map;

import org.springframework.stereotype.Service;
import spring.pet.clinic.model.Pet;
import spring.pet.clinic.services.PetService;

import java.util.Set;

@Service
public class PetServiceMap extends AbstractMapService<Pet,Integer> implements PetService {

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
