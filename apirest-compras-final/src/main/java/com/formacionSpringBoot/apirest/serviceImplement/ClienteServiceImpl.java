package com.formacionSpringBoot.apirest.serviceImplement;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formacionSpringBoot.apirest.Dao.ClienteRepository;
import com.formacionSpringBoot.apirest.entity.Cliente;
import com.formacionSpringBoot.apirest.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository repositorio;
	
	@Override
	public void delete(Long codCliente) {
		repositorio.deleteById(codCliente);

	}

	@Override
	public List<Cliente> findAll() {		
		return (List<Cliente>) repositorio.findAll();
	}

	@Override
	public Cliente findById(Long codCliente) {		
		return repositorio.findById(codCliente).orElse(null);
	}

	@Override
	public Cliente save(Cliente cliente) {		
		return repositorio.save(cliente);
	}


	@Override
	public Cliente deleteConRetorno(Long codCliente) {		
		Cliente c = repositorio.findById(codCliente).get();
		repositorio.deleteById(codCliente);
		return c;
	}
	
	@Override
	@Transactional(readOnly=true)
	public Cliente findByNombre(String nombre) {
		return repositorio.findByNombre(nombre);
	}

}