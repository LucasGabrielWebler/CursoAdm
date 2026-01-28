package br.com.adminfo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.adminfo.model.Estilo;
import br.com.adminfo.repository.Estilos;

@Service
public class EstiloService {

	@Autowired
	private Estilos estilos;

	@Transactional
	public void salvar(Estilo estilo) {
		estilos.save(estilo);
	}
}
