package br.com.adminfo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.adminfo.model.Cliente;
import br.com.adminfo.repository.helper.cliente.ClientesQueries;

public interface Clientes extends JpaRepository<Cliente, Long>, ClientesQueries {

	List<Cliente> findByNomeStartingWithIgnoreCase(String nome);

}
