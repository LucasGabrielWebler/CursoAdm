package br.com.adminfo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.adminfo.model.Estado;
import br.com.adminfo.repository.Estados;

@Service
public class EstadoService {

	@Autowired
	private Estados estados;

	@Transactional
	public void salvar(Estado estado) {
		estados.save(estado);
	}
}
