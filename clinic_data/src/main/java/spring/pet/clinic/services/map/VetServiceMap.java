package spring.pet.clinic.services.map;

import org.springframework.stereotype.Service;
import spring.pet.clinic.model.Vet;
import spring.pet.clinic.services.VetService;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet,Integer> implements VetService {

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
        return super.save(object);
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
