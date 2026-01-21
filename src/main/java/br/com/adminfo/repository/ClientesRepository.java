package br.com.adminfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.adminfo.model.Cliente;

public interface ClientesRepository extends JpaRepository<Cliente, Long> {

}
