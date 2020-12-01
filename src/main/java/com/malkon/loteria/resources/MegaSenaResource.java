package com.malkon.loteria.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.malkon.loteria.domain.MegaSena;
import com.malkon.loteria.services.MegaSenaService;

@RestController
@RequestMapping(value = "/megasena")
public class MegaSenaResource {

	@Autowired
	private MegaSenaService service;

	@RequestMapping(value = "/{qntJogos}/{qntNumeros}", method = RequestMethod.GET)
	public ResponseEntity<List<MegaSena>> gera(@PathVariable Integer qntJogos, @PathVariable Integer qntNumeros) {
		List<MegaSena> jogos = service.gerarJogo(qntJogos, qntNumeros);
		return ResponseEntity.ok().body(jogos);

	}
}
