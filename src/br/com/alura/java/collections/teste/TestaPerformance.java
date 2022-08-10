package br.com.alura.java.collections.teste;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

	public static void main(String[] args) {
		int n = 100000;
		Collection<Integer> numerosList = new ArrayList<Integer>();
		System.out.println("Tempo de adição e busca (List):");
		long inicioList = System.currentTimeMillis();
		for (int i = 1; i <= n; i++) {
			numerosList.add(i);
		}
		long fimAddList = System.currentTimeMillis();
		long tempoDeExecucaoAddList = fimAddList - inicioList;
		System.out.println("Tempo total para adicionar " + n + " elementos: " + tempoDeExecucaoAddList);
		long inicioBuscaList = System.currentTimeMillis();
		for (Integer numero: numerosList) {
			numerosList.contains(numero);
		}
		long fimBuscaList = System.currentTimeMillis();
		long tempoDeExecucaoBuscaList = fimBuscaList - inicioBuscaList;
		System.out.println("Tempo total para buscar " + n + " elementos: " + tempoDeExecucaoBuscaList);
		long tempoDeExecucaoList = tempoDeExecucaoAddList + tempoDeExecucaoBuscaList;
		System.out.println("Tempo total gasto: " + tempoDeExecucaoList);
		
		Collection<Integer> numerosSet = new HashSet<Integer>();
		System.out.println("Tempo de adição e busca (Set):");
		long inicioSet = System.currentTimeMillis();
		for (int i = 1; i <= n; i++) {
			numerosSet.add(i);
		}
		long fimAddSet = System.currentTimeMillis();
		long tempoDeExecucaoAddSet = fimAddSet - inicioSet;
		System.out.println("Tempo total para adicionar " + n + " elementos: " + tempoDeExecucaoAddSet);
		long inicioBuscaSet = System.currentTimeMillis();
		for (Integer numero: numerosSet) {
			numerosSet.contains(numero);
		}
		long fimBuscaSet = System.currentTimeMillis();
		long tempoDeExecucaoBuscaSet = fimBuscaSet - inicioBuscaSet;
		System.out.println("Tempo total para buscar " + n + " elementos: " + tempoDeExecucaoBuscaSet);
		long tempoDeExecucaoSet = tempoDeExecucaoAddSet + tempoDeExecucaoBuscaSet;
		System.out.println("Tempo total gasto: " + tempoDeExecucaoSet);
		
		
	}
}
