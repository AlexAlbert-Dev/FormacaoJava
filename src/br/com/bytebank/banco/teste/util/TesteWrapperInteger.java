package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {

		
		int idade = 29; //Integer
		//Wrapper
		Integer idadeRef = Integer.valueOf(29); //como Integer é do java.lang, não precisa importar
		System.out.println(idadeRef.doubleValue());
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(idadeRef); //Autoboxing
		//numeros.add(Integer.valueOf(29)); é assim que o compilador faz, para converter um
		//primitivo para um referencia.
		
		int valor = idadeRef.intValue();
		String s = args[0]; //"12"	args=argumento por console
		
		//Integer numero = Integer.valueOf(s);
		int numero = Integer.parseInt(s);
		System.out.println(numero);
		

	}

}
