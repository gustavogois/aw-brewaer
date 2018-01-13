package com.algaworks.breawer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.algaworks.breawer.model.Cerveja;

@Controller
public class CervejasController {

	@RequestMapping("/cervejas/novo")
	public String novo() {
		return "cerveja/cadastroCerveja";
	}
	
	@RequestMapping(value = "/cervejas/novo", method = RequestMethod.POST)
	public String cadstrar(Cerveja cerveja) {
		System.out.println(" >>>>>> Cadastrar!! SKU: " + cerveja.getSku());
		return "cerveja/cadastroCerveja";
	}
}
