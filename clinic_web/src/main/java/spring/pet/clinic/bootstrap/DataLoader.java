package spring.pet.clinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import spring.pet.clinic.model.Owner;
import spring.pet.clinic.model.Vet;
import spring.pet.clinic.services.OwnerService;
import spring.pet.clinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1=new Owner();
        owner1.setId(1);
        owner1.setFirstName("Masoud");
        owner1.setLastName("ider");

        ownerService.save(owner1);

        Owner owner2=new Owner();
        owner2.setId(2);
        owner2.setFirstName("hasan");
        owner2.setLastName("kamali");

        ownerService.save(owner2);

        Vet vet1=new Vet();
        vet1.setId(1);
        vet1.setFirstName("ali");
        vet1.setLastName("hasani");

        vetService.save(vet1);

        Vet vet2=new Vet();
        vet2.setId(2);
        vet2.setFirstName("david");
        vet2.setLastName("kiani");

        vetService.save(vet2);

        System.out.println("DataLoader");

    }
}
