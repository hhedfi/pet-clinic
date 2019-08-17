package com.learn.springframework.petclinic.map;

import com.learn.springframework.petclinic.model.Pet;
import com.learn.springframework.petclinic.services.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Long, Pet> implements CrudService<Long, Pet> {


    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
    @Override
    public void delete(Pet object) {
        super.delete(object);
    }


}
