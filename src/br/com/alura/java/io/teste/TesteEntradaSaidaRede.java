package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;

public class TesteEntradaSaidaRede {

	public static void main(String[] args) throws IOException {
		
		// Fluxo de Entrada com Rede
		Socket s = new Socket();
		InputStream fis = s.getInputStream(); // System.in; // new FileInputStream("lorem.txt");
		Reader isr = new InputStreamReader(fis);	
		BufferedReader br = new BufferedReader(isr);	
		// Fluxo de Saída com Rede
		OutputStream fos = s.getOutputStream(); // System.out; // new FileOutputStream("lorem3.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String linha = br.readLine();
		
		while(linha != null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			bw.flush(); // método para o console mostrar o que foi digitado em seguida, sem necessidade de aguardar o bw.close()
			linha = br.readLine();
		}
		
		br.close();
		bw.close();
	}
}
