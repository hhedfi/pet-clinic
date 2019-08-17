package com.learn.springframework.petclinic.services;

import java.util.Set;

public interface CrudServie<T, ID> {

    T findById(ID id);

    T save(T object);

    Set<T> findAll();
}
