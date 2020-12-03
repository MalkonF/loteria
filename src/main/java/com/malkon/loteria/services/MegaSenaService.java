package com.malkon.loteria.services;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.malkon.loteria.domain.MegaSena;

@Service
public class MegaSenaService {

	@Autowired
	FiltragemService filtragemService;

	private List<Integer> dezenasSorteadas = new ArrayList<>();
	private SortedSet<Integer> numerosSorteados = new TreeSet<>();

	public ArrayList<MegaSena> gerarJogo(Integer qntJogos, Integer qntNumeros) {
		SecureRandom geraNumSorteados = new SecureRandom();
		ArrayList<MegaSena> jogosSorteados = new ArrayList<>();
		while (jogosSorteados.size() < qntJogos) {
			while (dezenasSorteadas.size() < qntNumeros) {
				int random = 1 + geraNumSorteados.nextInt(59);
				if (!dezenasSorteadas.contains(random)) {
					dezenasSorteadas.add(random);
				}
			}
			numerosSorteados.clear();
			numerosSorteados.addAll(dezenasSorteadas);
			dezenasSorteadas.clear();
			if (!filtragemService.filtrar(numerosSorteados))
				jogosSorteados.add(new MegaSena(numerosSorteados));
		}
		return jogosSorteados;
	}
}
