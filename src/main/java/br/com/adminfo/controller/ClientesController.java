package br.com.adminfo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.adminfo.model.Cliente;
import br.com.adminfo.model.TipoPessoa;
import br.com.adminfo.repository.Estados;
import br.com.adminfo.service.ClienteService;

@Controller
@RequestMapping("/clientes")
public class ClientesController {
	
	@Autowired
	private Estados estados;
	
	@Autowired
	private ClienteService clienteService;

	@RequestMapping("/novo")
	public ModelAndView novo(Cliente cliente) {
		ModelAndView mv = new ModelAndView("cliente/CadastroCliente");
		mv.addObject("tiposPessoa", TipoPessoa.values());
		mv.addObject("estados", estados.findAll());
		return mv;
	}
	
	@PostMapping("/novo")
	public ModelAndView salvar(@Valid Cliente cliente, BindingResult result, RedirectAttributes attributes) {
		if(result.hasErrors()) {
			return novo(cliente);
		}
		clienteService.salvar(cliente);
		
		attributes.addFlashAttribute("mensagem", "Cliente salvo com sucesso");
		return new ModelAndView("redirect:/clientes/novo");
	}
	
}
