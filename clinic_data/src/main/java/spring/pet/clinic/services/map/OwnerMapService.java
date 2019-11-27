package spring.pet.clinic.services.map;

import org.springframework.stereotype.Service;
import spring.pet.clinic.model.Owner;
import spring.pet.clinic.model.Pet;
import spring.pet.clinic.services.OwnerService;
import spring.pet.clinic.services.PetService;
import spring.pet.clinic.services.PetTypeService;

import java.util.Set;

@Service
public class OwnerMapService extends AbstractMapService<Owner, Integer> implements OwnerService {

    private PetService petService;
    private PetTypeService petTypeService;

    public OwnerMapService(PetService petService, PetTypeService petTypeService) {
        this.petService = petService;
        this.petTypeService = petTypeService;
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Integer id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        if (object != null) {
            if (object.getPets() != null) {
                object.getPets().forEach(pet -> {
                    if (pet.getPetType() != null) {
                        if (pet.getPetType().getId() == null) {
                            pet.setPetType(petTypeService.save(pet.getPetType()));
                        }
                    } else {
                        throw new RuntimeException("pet type is needed");
                    }
                    if (pet.getId() == null) {
                        Pet savedPet = petService.save(pet);
                        pet.setId(savedPet.getId());
                    }
                });
            }
            return super.save(object);
        } else {
            return null;
        }
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Integer id) {
        super.deleteById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
