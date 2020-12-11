package com.lucasgalvao.cursomc.resources;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public String listar() {
		return "Rest está funcionando";
	}
}
