package com.brendow.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brendow.cursomc.domain.Categoria;
import com.brendow.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Long id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}
}
