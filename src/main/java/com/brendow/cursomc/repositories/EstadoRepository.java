package com.brendow.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brendow.cursomc.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long>{
	
}
