package com.formacionSpringBoot.apirest.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.formacionSpringBoot.apirest.entity.Compra;


@Repository
public interface CompraRepository extends CrudRepository<Compra, Long> {
	
	

}