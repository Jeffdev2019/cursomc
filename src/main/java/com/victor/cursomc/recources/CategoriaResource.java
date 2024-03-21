package com.victor.cursomc.recources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

	
	@RequestMapping(method=RequestMethod.GET)
	public String listar() {
		return "Rest está fucionando!";
	}
}
