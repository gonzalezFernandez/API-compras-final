package com.formacionSpringBoot.apirest.service;

import java.util.List;

import com.formacionSpringBoot.apirest.entity.Articulo;





public interface ArticuloService {
	
	public List<Articulo> findAll();
	
	public Articulo findById(Long codArticulo);
	
	public Articulo save(Articulo codArticulo);
	
	public void delete(Long codArticulo);
	
	public Articulo findByNombre(String nombre);
	
}