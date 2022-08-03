package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {

	public static void main(String[] args) {
		
		// int idadeRef = 29;
		// System.out.println(idadeRef);
		Integer idadeRef = Integer.valueOf(29); // autoboxing
		System.out.println(idadeRef.intValue()); // unboxing

		// double dRef = 3.2;
		// System.out.println(dRef);
		Double dRef = Double.valueOf(3.2); // autoboxing
		System.out.println(dRef.doubleValue()); // unboxing
		
		// boolean bRef = true;
		// System.out.println(bRef);
		Boolean bRef = Boolean.TRUE; // autoboxing
		System.out.println(bRef.booleanValue()); // unboxing
		
		// Todas as classes numéricas (double, float, long, integer, short e byte)
		// são filhas da classe Number
		
		Number refNumero = Float.valueOf(29.9f);
		
		List<Number> lista = new ArrayList<>();
		lista.add(10);
		lista.add(32.6);
		lista.add(25.6f);
		
		
		
		
		
	}

}
