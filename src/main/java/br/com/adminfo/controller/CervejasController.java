package br.com.adminfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.adminfo.model.Cerveja;

@Controller
@RequestMapping("/cervejas")
public class CervejasController {
	
	@RequestMapping("/nova")
	public ModelAndView novo(Cerveja cerveja) {
		ModelAndView mv = new ModelAndView("cerveja/CadastroCerveja");
		return mv;
	}
	
	public static void main(String [] args) {
		System.out.println("Teste");
	}
	
}