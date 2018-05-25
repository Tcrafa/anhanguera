package com.programacao.anhanguera.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.programacao.anhanguera.entity.Cliente;
import com.programacao.anhanguera.repository.ClienteRepository;

@Controller

public class ClienteController {
	
	private ClienteRepository clienteRepository;

	public ClienteController(ClienteRepository clienteRepository) {
		this.clienteRepository=clienteRepository;
	}
	
	@RequestMapping(value="/listaCliente", method=RequestMethod.GET)
	public String listaCliente() {
		
		return "index";
	}
	
	@RequestMapping(value="/cadastro", method=RequestMethod.GET)
	public String castro(Model model) {
		model.addAttribute("cliente", new Cliente());
		return "cadcliente";
	}
	
	@PostMapping(value="/salvar")
	public String salvar(@Valid Cliente cliente, BindingResult result, Model model) {
		clienteRepository.save(cliente);
		return "index";
	}
}
