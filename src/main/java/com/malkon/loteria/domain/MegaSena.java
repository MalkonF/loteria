package com.malkon.loteria.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;

import org.springframework.stereotype.Component;

@Component
public class MegaSena implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Integer> numerosSorteados = new ArrayList<>();

	public MegaSena(SortedSet<Integer> numerosSorteados) {
		this.numerosSorteados = new ArrayList<>(numerosSorteados);
	}

	public List<Integer> getNumerosSorteados() {
		return numerosSorteados;
	}

	public void setNumerosSorteados(List<Integer> numerosSorteados) {
		this.numerosSorteados = numerosSorteados;
	}
}