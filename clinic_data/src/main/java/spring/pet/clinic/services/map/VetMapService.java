package spring.pet.clinic.services.map;

import org.springframework.stereotype.Service;
import spring.pet.clinic.model.Speciality;
import spring.pet.clinic.model.Vet;
import spring.pet.clinic.services.SpecialtyService;
import spring.pet.clinic.services.VetService;

import java.util.Set;

@Service
public class VetMapService extends AbstractMapService<Vet, Integer> implements VetService {

    private final SpecialtyService specialtyService;

    public VetMapService(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Integer id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet vet) {
        if (vet.getSpecialities().size()>0){
            vet.getSpecialities().forEach(speciality -> {
                if (speciality.getId()==null){
                    Speciality savedSpeciality=specialtyService.save(speciality);
                    speciality.setId(savedSpeciality.getId());
                }
            });
        }
        return super.save(vet);
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
