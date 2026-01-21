package br.com.adminfo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.adminfo.model.Cidade;
import br.com.adminfo.repository.Cidades;

@Controller
@RequestMapping("/cidades")
public class CidadesController {
	
	@Autowired
	private Cidades cidades;
	
	@RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Cidade> pesquisarPorEstadoCodigo(@RequestParam(name = "estado", defaultValue = "-1") Long codigoEstado){
		
		try {
			Thread.sleep(500);
		}catch (InterruptedException e) {}
		
		return cidades.findByEstadoCodigo(codigoEstado);
	}

}
