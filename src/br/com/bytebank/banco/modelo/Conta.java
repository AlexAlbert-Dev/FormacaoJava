package br.com.bytebank.banco.modelo;

/**
 * Classe que representa a moldura de uma conta
 * @author Alex Albert
 *
 */

public abstract class Conta {
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;		//static quer dizer da classe

	
	/**
	 * Construtor para inicializar o objeto Conta a partir da agencia e numero
	 * @param agencia
	 * @param numero
	 */
	public Conta(int agencia, int numero) {
		Conta.total++;		//Conta.total++;  =  total++;
		//System.out.println("o total de contas é " + Conta.total);		//Conta.total = total
		this.agencia = agencia;
		this.numero = numero;
		//System.out.println("estou criando uma conta " + numero);
	}
	
	
	public abstract void deposita(double valor);
	
	/**
	 * Valor precisa ser maior que o saldo.
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	public void saca(double valor) throws SaldoInsuficienteException {
		if(this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		}
			this.saldo -= valor;
			
	}
	
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
		this.saca(valor);
		destino.deposita(valor);
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) { // void indica que o método não tem retorno nenhum
		if(numero <= 0) {
			System.out.println("não pode valor menor ou igual a 0");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("não pode valor menor ou igual a 0");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {		// public static indica que é um método da classe
		return total;
	}
	
	@Override
	public boolean equals(Object ref) {
		Conta outra = (Conta) ref;
		if(this.agencia != outra.agencia) {
			return false;
		}
		
		if(this.numero != outra.numero) {
			return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Numero " + this.numero + ", Agencia: " + this.agencia;
	}

}