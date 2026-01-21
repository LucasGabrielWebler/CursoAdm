package br.com.adminfo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.adminfo.model.Cidade;

public interface Cidades extends JpaRepository<Cidade, Long> {

	public List<Cidade> findByEstadoCodigo(Long codigoEstado);

}
