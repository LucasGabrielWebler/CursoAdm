package br.com.adminfo.repository.helper.estado;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.adminfo.model.Estado;
import br.com.adminfo.repository.filter.EstadoFilter;

public interface EstadosQueries{

	public Page<Estado> filtrar(EstadoFilter estadoFilter, Pageable pageable);
}
