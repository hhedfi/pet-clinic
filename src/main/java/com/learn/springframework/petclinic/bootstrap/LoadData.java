package com.learn.springframework.petclinic.bootstrap;

import com.learn.springframework.petclinic.model.Owner;
import com.learn.springframework.petclinic.model.Vet;
import com.learn.springframework.petclinic.services.OwnerService;
import com.learn.springframework.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class LoadData implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public LoadData(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Micheal");
        owner1.setLastName("Jackson");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Celine");
        owner2.setLastName("Dion");

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Georges");
        vet1.setLastName("Wassouf");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Kadhem");
        vet2.setLastName("Essaher");

        vetService.save(vet2);

        System.out.println("Loaded vets...");
    }
}
