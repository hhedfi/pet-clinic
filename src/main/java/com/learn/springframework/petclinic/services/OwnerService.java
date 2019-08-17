package com.learn.springframework.petclinic.services;


import com.learn.springframework.petclinic.model.Owner;

public interface OwnerService extends CrudService<Long, Owner> {

    Owner findByLastName(String lastName);

}
