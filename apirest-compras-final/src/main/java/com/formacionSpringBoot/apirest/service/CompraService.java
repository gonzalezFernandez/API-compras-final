package com.formacionSpringBoot.apirest.service;

import java.util.List;

import com.formacionSpringBoot.apirest.entity.Compra;


public interface CompraService {

	public List<Compra> findAll();

	public Compra findById(Long id);

	public Compra save(Compra compra);

	public void delete(Long id);
	
	public void deleteCompra(Compra c);
}