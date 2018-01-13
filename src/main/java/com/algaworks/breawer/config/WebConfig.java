package com.algaworks.breawer.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.algaworks.breawer.controller.CervejasController;

@Configuration
// Indicando para o Spring procurar os Controllers nesse diretório
//@ComponentScan("com.algaworks.brewer.controller")
// Indica ao Spring para encontrar os Controllers que estão neste mesmo pacote
@ComponentScan(basePackageClasses = { CervejasController.class})
@EnableWebMvc
public class WebConfig 
	// Podemos estender adaptadores para facilitar nossa configuração
	extends WebMvcConfigurerAdapter {

}
