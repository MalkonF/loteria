package com.malkon.loteria.services.utils;

import java.util.SortedSet;

import org.springframework.stereotype.Component;

@Component
public class UsandoFactory {

	public boolean filtrandoUsandoFactory(SortedSet<Integer> numerosSorteados, String qualFiltro) {
		Operacao operacaoAlvo = FabricaOperacao.getOperacao(qualFiltro)
				.orElseThrow(() -> new IllegalArgumentException("Invalid Operator"));
		return operacaoAlvo.filtrar(numerosSorteados);

	}

}
