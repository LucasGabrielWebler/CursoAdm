package br.com.adminfo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.adminfo.model.Cliente;
import br.com.adminfo.repository.Clientes;

@Service
public class ClienteService {
	
	@Autowired
	private Clientes clientes;

	@Transactional
	public void salvar(Cliente cliente) {
		clientes.save(cliente);
	}
}
