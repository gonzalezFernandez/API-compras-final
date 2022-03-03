package com.formacionSpringBoot.apirest.Dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.formacionSpringBoot.apirest.entity.Articulo;


@Repository
public interface ArticuloRepository extends CrudRepository<Articulo, Long> {

	@Query("select articulo from Articulo articulo where articulo.nombre=?1") //realiza la consulta de articulo + {}
 	public Articulo findByNombre(String articulo);
}