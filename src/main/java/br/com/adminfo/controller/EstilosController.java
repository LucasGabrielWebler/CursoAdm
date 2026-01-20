package br.com.adminfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.adminfo.model.Estilo;

@Controller
@RequestMapping("/estilos")
public class EstilosController {
	
	@RequestMapping("/novo")
	public ModelAndView novo(Estilo estilo) {
		ModelAndView mv = new ModelAndView("estilo/CadastroEstilo");
		return mv;
	}
	
}