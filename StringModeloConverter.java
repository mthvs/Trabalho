package com.demomvc.curso.boot.conversor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.demomvc.curso.boot.domain.Modelo;
import com.demomvc.curso.boot.service.ModeloService;

@Component
public class StringModeloConverter implements Converter<String, Modelo> {

	@Autowired
	private ModeloService service;
	
	public Modelo convert(String Text) {
		if(Text.isEmpty()) {
				return null;
		}
		Long id = Long.valueOf(Text);
		return service.buscarPorId(id);
	}


}
