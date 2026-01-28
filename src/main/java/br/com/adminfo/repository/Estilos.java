package br.com.adminfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.adminfo.model.Estilo;
import br.com.adminfo.repository.helper.estilo.EstilosQueries;

public interface Estilos extends JpaRepository<Estilo, Long>, EstilosQueries{

}
