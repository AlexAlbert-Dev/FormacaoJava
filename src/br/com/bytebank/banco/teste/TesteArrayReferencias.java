package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		// array literal: int[] refs = {1,2,3,4,5};
		
		//int[] idades = new int[5];
		Conta[] referencias = new Conta[5];	//valor default de uma referencia é null
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		
		referencias[0] = cc1;
		
		ContaPoupanca cp2 = new ContaPoupanca(22, 22);
		referencias[1] = cp2;

//		System.out.println(cc2.getNumero());
		ContaPoupanca ref2 = (ContaPoupanca) referencias[1];
//		System.out.println(referencias[1].getNumero());
		System.out.println(ref2.getNumero());
		
//		Conta ref = contas[1];
		// mudar a referencia de tipo Conta para ref de tipo ContaPoupanca via typecast
		ContaPoupanca ref = (ContaPoupanca) referencias[1]; //type cast
		System.out.println(ref.getNumero());
		
	}

}
