package com.ashish.petclinic.services;

import com.ashish.petclinic.model.Owner;



public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);
}
