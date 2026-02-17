package br.com.adminfo.service;

import javax.persistence.PersistenceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.adminfo.model.Cliente;
import br.com.adminfo.repository.Clientes;
import br.com.adminfo.service.exception.ImpossivelExcluirEntidadeException;

@Service
public class ClienteService {
	
	@Autowired
	private Clientes clientes;

	@Transactional
	public void salvar(Cliente cliente) {
		clientes.save(cliente);
	}

	@Transactional
	public void excluir(Cliente cliente) {
		try {
			clientes.delete(cliente);	
		} catch(PersistenceException e){
			throw new ImpossivelExcluirEntidadeException("Não foi possível excluir esse cliente, pois ele já possue vendas!");
		}
		
	}
}
