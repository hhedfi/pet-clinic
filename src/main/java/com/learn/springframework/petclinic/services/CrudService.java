package com.learn.springframework.petclinic.services;

import java.util.Set;

public interface CrudService<ID, T> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void deleteById(ID id);

    void delete(T object);

}
