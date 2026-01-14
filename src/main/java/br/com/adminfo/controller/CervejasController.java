package br.com.adminfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.adminfo.model.Cerveja;
import br.com.adminfo.model.Origem;
import br.com.adminfo.model.Sabor;
import br.com.adminfo.repository.Estilos;

@Controller
@RequestMapping("/cervejas")
public class CervejasController {
	
	@Autowired
	private Estilos estilos;
	
	@RequestMapping("/nova")
	public ModelAndView novo(Cerveja cerveja) {
		ModelAndView mv = new ModelAndView("cerveja/CadastroCerveja");
		mv.addObject("origens", Origem.values());
		mv.addObject("sabores", Sabor.values());
		mv.addObject("estilos", estilos.findAll());
		return mv;
	}
	
}