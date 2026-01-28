package br.com.adminfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.adminfo.model.Cerveja;
import br.com.adminfo.repository.helper.cerveja.CervejasQueries;

public interface Cervejas extends JpaRepository<Cerveja, Long>, CervejasQueries{
	
}
