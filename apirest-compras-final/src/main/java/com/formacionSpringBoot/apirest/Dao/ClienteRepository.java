package com.formacionSpringBoot.apirest.Dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.formacionSpringBoot.apirest.entity.Cliente;


@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

		@Query("select cliente from Cliente cliente where cliente.nombre=?1") //realiza la consulta de cliente + parametros
	 	public Cliente findByNombre(String nombre);

}