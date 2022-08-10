package br.com.alura.java.collections.teste;

public class Aluno {

	private String nome;
	private int NumeroMatricula;
	
	public Aluno(String nome, int numeroMatricula) {
		this.nome = nome;
		this.NumeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroMatricula() {
		return NumeroMatricula;
	}
	
	@Override
	public String toString() {
		return "[Aluno: " + this.nome + ", matricula: " + this.NumeroMatricula + "]";
	}
}
