package br.com.adminfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.adminfo.model.Cerveja;

public interface Cervejas extends JpaRepository<Cerveja, Long>{

}
