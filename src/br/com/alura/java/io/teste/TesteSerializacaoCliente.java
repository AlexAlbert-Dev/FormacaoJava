package br.com.alura.java.io.teste;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacaoCliente {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		ClienteJavaIo cliente = new ClienteJavaIo();
		cliente.setNome("Alex");
		cliente.setProfissao("Dev");
		cliente.setCpf("234113131");
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
		oos.writeObject(cliente);
		oos.close();

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		ClienteJavaIo leituraCliente = (ClienteJavaIo) ois.readObject();
		ois.close();
		System.out.println(leituraCliente.getCpf());
	}
}
