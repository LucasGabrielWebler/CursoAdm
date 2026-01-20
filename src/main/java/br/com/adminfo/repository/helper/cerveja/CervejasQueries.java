package br.com.adminfo.repository.helper.cerveja;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.adminfo.model.Cerveja;
import br.com.adminfo.repository.filter.CervejaFilter;

public interface CervejasQueries {
	
	public Page<Cerveja> filtrar(CervejaFilter cervejaFilter, Pageable pageable);
}
