package com.algaworks.breawer.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.algaworks.breawer.model.Cerveja;

@Controller
public class CervejasController {

	@RequestMapping("/cervejas/novo")
	public String novo() {
		return "cerveja/cadastroCerveja";
	}
	
	@RequestMapping(value = "/cervejas/novo", method = RequestMethod.POST)
	public String cadstrar(@Valid Cerveja cerveja, BindingResult bidingResult, Model model, RedirectAttributes redirectAttribute) {
		
		if( bidingResult.hasErrors() ) {
			model.addAttribute("mensagem", "Erro no formulário");
			return "cerveja/cadastroCerveja";
		}
		
		// Cria uma sessão e coloca o atributo, para que ele permaneça mesmo com o redirect
		redirectAttribute.addFlashAttribute("mensagem", "Cerveja salva com sucesso!");
		System.out.println(" >>>>>> Cadastrar!! SKU: " + cerveja.getSku());
		return "redirect:/cervejas/novo";
	}
}
