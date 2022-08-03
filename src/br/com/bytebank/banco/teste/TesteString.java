package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		String nome = "Alura";
		//String outro = new String("Alura"); sintaxe literal
		
		char c = 'A';
		char d = 'a';
		
		char e = nome.charAt(0);
		System.out.println(e);
		
		int pos = nome.indexOf("ura");
		System.out.println(pos);
		
		String sub = nome.substring(1);
		System.out.println(sub);
		
		String outra = nome.replace("A", "a");
		String outra1 = nome.replace(c, d);
		
		System.out.println(nome);
		System.out.println(outra);
		System.out.println(outra1);
		
		//pesquisar sobre StringBuilder
		
		
	}
}
