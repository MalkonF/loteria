package com.malkon.loteria.services.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class FabricaOperacao {
	
	static Map<String, Operacao> mapaOperacao = new HashMap<>();
	
	static {
		mapaOperacao.put("sequenciaNumerica", new FiltragemSequenciaNumerica());
	}
	
	public static Optional<Operacao> getOperacao(String operador){
		return Optional.ofNullable(mapaOperacao.get(operador));
	}

}
