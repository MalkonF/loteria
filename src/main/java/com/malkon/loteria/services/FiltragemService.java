package com.malkon.loteria.services;

import java.util.Arrays;
import java.util.SortedSet;

import org.springframework.stereotype.Service;

@Service
public class FiltragemService {

	public boolean filtrar(SortedSet<Integer> numerosSorteados) {
		Integer[] arrDosNumSorteados = (numerosSorteados.toArray(new Integer[numerosSorteados.size()]));
		Arrays.sort(arrDosNumSorteados);
		for (int i = 0; i < arrDosNumSorteados.length - 3 + 1; ++i) {
			if (arrDosNumSorteados[i] == arrDosNumSorteados[i + 1] - 1) {
				return true;
			}
		}
		return false;
	}
}