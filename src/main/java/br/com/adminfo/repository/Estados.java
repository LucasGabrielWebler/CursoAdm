package br.com.adminfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.adminfo.model.Estado;
import br.com.adminfo.repository.helper.estado.EstadosQueries;

public interface Estados extends JpaRepository<Estado, Long>, EstadosQueries{

}
