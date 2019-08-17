package com.learn.springframework.petclinic.map;

import com.learn.springframework.petclinic.model.Vet;
import com.learn.springframework.petclinic.services.CrudService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Long, Vet> implements CrudService<Long, Vet> {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

}