package com.algaworks.breawer.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
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
	public String cadstrar(@Valid Cerveja cerveja, BindingResult bidingResult) {
		
		if( bidingResult.hasErrors() ) {
			System.out.println("Tem erros!!!");
		}
		
		System.out.println(" >>>>>> Cadastrar!! SKU: " + cerveja.getSku());
		return "cerveja/cadastroCerveja";
	}
}
