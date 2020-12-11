package com.malkon.loteria.services.utils;

import java.util.SortedSet;

public interface Operacao {
	
	boolean filtrar(SortedSet<Integer> numerosSorteados);
}
