package br.com.alura.java.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenaStrings {

	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");
		
		palavras.sort(Comparator.comparing(String::length));
		System.out.println(palavras);
		
		palavras.forEach(System.out::println);
		
	}
}