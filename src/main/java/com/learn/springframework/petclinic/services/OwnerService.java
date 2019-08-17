package com.learn.springframework.petclinic.services;


import com.learn.springframework.petclinic.model.Owner;

public interface OwnerService extends CrudServie<Owner, Long> {

    Owner findByLastName(String lastName);

}
