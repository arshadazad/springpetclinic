package org.learning.services;

import java.util.Set;

import org.learning.model.Vet;

public interface VetService {
	
	Vet findById(Long id);

	Vet save(Vet vet);

	Set<Vet> findAll();
}
