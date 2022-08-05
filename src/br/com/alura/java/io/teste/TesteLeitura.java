package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {
		
		// Fluxo de Entrada com Arquivo
		// Padrão Decorator
		InputStream fis = new FileInputStream("lorem.txt"); // Interpreta os bits e bytes
		Reader isr = new InputStreamReader(fis);	// transforma bytes em caracteres
		BufferedReader br = new BufferedReader(isr);	// transforma caracteres em linhas
		
		String linha = br.readLine();
		
		while(linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		
		System.out.println(linha);
		
		br.close();
		
	}
}
