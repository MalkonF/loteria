package com.malkon.loteria.resources;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.malkon.loteria.domain.MegaSena;

@RestController
@RequestMapping(value = "/megasena")
public class MegaSenaResource {

	@RequestMapping(value = "/{qntJogos}/{qntNumeros}", method = RequestMethod.GET)
	public ResponseEntity<List<MegaSena>> gera(@PathVariable Integer qntJogos, @PathVariable Integer qntNumeros) {
		return null;
	}
}
