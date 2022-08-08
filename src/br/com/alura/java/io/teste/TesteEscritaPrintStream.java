package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;

public class TesteEscritaPrintStream {

	public static void main(String[] args) throws IOException {
		// PrintStream existe desde o início do Java
		PrintStream ps = new PrintStream("lorem2.txt");
		// PrintStream ps = new PrintStream(new File("lorem2.txt")); Para trabalhar com caminho de arquivo
		
		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		ps.println();
		ps.println();
		ps.println("fasdfasdfasdf");
		
		ps.close();
		

	}

}
