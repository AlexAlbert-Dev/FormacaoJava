package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class TesteSaca {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(123, 321);
		conta.deposita(200.0);
//		conta.saca(190.0);
//		System.out.println(conta.getSaldo());
		try {
			conta.saca(210.0);
		} catch(SaldoInsuficienteException ex) {
			System.out.println("EX: " + ex.getMessage());
		}
		System.out.println(conta.getSaldo());
		
	}
}
