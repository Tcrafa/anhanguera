package com.programacao.anhanguera.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class ClienteController {

	@RequestMapping(value="/listaCliente", method=RequestMethod.GET)
	public String listaCliente() {
		
		return "index";
	}
}
