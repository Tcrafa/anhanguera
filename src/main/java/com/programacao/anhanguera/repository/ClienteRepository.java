package com.programacao.anhanguera.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.programacao.anhanguera.entity.Cliente;

@Repository

public interface ClienteRepository extends CrudRepository<Cliente, Long>{
	List<Cliente> findAll();
 
}
