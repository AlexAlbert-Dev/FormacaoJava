package br.com.alura.java.java8;

import java.util.ArrayList;
import static java.util.Comparator.comparing;
import java.util.List;

public class OrdenaStrings {

	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");
		
		palavras.sort(comparing(String::length));
		System.out.println(palavras);
		
		palavras.forEach(System.out::println);
		
	}
}