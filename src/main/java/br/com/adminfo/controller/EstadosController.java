package br.com.adminfo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.adminfo.controller.page.PageWrapper;
import br.com.adminfo.model.Estado;
import br.com.adminfo.repository.Estados;
import br.com.adminfo.repository.filter.EstadoFilter;
import br.com.adminfo.service.EstadoService;

@Controller
@RequestMapping("/estados")
public class EstadosController {

	@Autowired
	private Estados estados;
	
	@Autowired 
	private EstadoService estadoService;
	
	@RequestMapping("/novo")
	public ModelAndView novo(Estado estado) {
		ModelAndView mv = new ModelAndView("estado/CadastroEstado");
		return mv;
	}
	
	@PostMapping("/novo")
	public ModelAndView salvar(@Valid Estado estado, BindingResult result, RedirectAttributes attributes) {
		if(result.hasErrors()) {
			return novo(estado);
		}
		estadoService.salvar(estado);
		
		attributes.addFlashAttribute("mensagem", "Estado salvo com sucesso");
		return new ModelAndView("redirect:/estado/novo");
	}
	
	@GetMapping
	public ModelAndView pesquisar(EstadoFilter estadoFilter, @PageableDefault(size = 2) Pageable pageable, HttpServletRequest httpServletRequest ) {
		ModelAndView mv = new ModelAndView("estado/PesquisaEstados");
		
		PageWrapper<Estado> paginaWrapper = new PageWrapper<>(estados.filtrar(estadoFilter, pageable), httpServletRequest);
		mv.addObject("pagina", paginaWrapper);
		return mv;
		
	}
}
