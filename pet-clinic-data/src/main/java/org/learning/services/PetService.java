package org.learning.services;

import java.util.Set;

import org.learning.model.Pet;

public interface PetService {

	Pet findById(Long id);

	Pet save(Pet pet);

	Set<Pet> findAll();
}
