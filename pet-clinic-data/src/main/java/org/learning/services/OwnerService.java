package org.learning.services;

import java.util.Set;

import org.learning.model.Owner;

public interface OwnerService {

	Owner findById(Long id);

	Owner save(Owner owner);

	Owner findByLastName(String lastName);

	Set<Owner> findAll();
}
