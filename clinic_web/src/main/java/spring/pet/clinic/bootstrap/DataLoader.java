package spring.pet.clinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import spring.pet.clinic.model.*;
import spring.pet.clinic.services.OwnerService;
import spring.pet.clinic.services.PetTypeService;
import spring.pet.clinic.services.SpecialtyService;
import spring.pet.clinic.services.VetService;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialtyService specialtyService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialtyService specialtyService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialtyService = specialtyService;
    }

    @Override
    public void run(String... args) throws Exception {
        if(petTypeService.findAll().size()==0){
            loadData();
        }
    }

    private void loadData(){
        PetType dog=new PetType();
        dog.setName("DOG");
        petTypeService.save(dog);

        PetType cat=new PetType();
        cat.setName("CAT");
        petTypeService.save(cat);

        Speciality radiology=new Speciality();
        radiology.setDescription("Radiology");

        Speciality saveRadiology=specialtyService.save(radiology);

        Speciality surgery=new Speciality();
        surgery.setDescription("Surgery");

        Speciality saveSurgery=specialtyService.save(surgery);

        Speciality dentistry=new Speciality();
        surgery.setDescription("Dentistry");

        Speciality saveDentistry=specialtyService.save(dentistry);

        Owner owner1 = new Owner();
        //owner1.setId(1);
        owner1.setFirstName("Masoud");
        owner1.setLastName("ider");
        owner1.setAddress("Iran");
        owner1.setCity("BRN");
        owner1.setPhone("9139887321");

        Pet pet=new Pet();
        pet.setPetType(dog);
        pet.setOwner(owner1);
        pet.setBirthDate(LocalDate.now());
        pet.setName("Rosco");

        owner1.getPets().add(pet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        // owner2.setId(2);
        owner2.setFirstName("hasan");
        owner2.setLastName("kamali");
        owner2.setAddress("Iran");
        owner2.setCity("ISF");
        owner2.setPhone("9131839044");
        ownerService.save(owner2);

        Pet pet1=new Pet();
        pet1.setName("CAT");
        pet1.setOwner(owner2);
        pet1.setBirthDate(LocalDate.now());
        pet1.setPetType(cat);

        owner2.getPets().add(pet1);

        Vet vet1 = new Vet();
        //  vet1.setId(1);
        vet1.setFirstName("ali");
        vet1.setLastName("hasani");

        vet1.getSpecialities().add(saveRadiology);
        vetService.save(vet1);

        Vet vet2 = new Vet();
        //   vet2.setId(2);
        vet2.setFirstName("david");
        vet2.setLastName("kiani");
        vet2.getSpecialities().add(saveSurgery);
        vetService.save(vet2);

        System.out.println("DataLoader");
    }

}
