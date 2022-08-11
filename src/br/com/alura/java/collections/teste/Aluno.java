package br.com.alura.java.collections.teste;

public class Aluno {

	private String nome;
	private int NumeroMatricula;
	
	public Aluno(String nome, int numeroMatricula) {
		if(nome == null) {
			throw new NullPointerException("Nome não pode ser vazio!");
		}
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
	public boolean equals(Object obj) {	// Ao reescrever metodo equals em um set, é obrigatorio reescrever também
		Aluno outro = (Aluno) obj;		// o método HashCode, devido o Set ser organizado via tabela de espalhamento
		return this.nome.equals(outro.nome);
	}
	
	@Override
	public int hashCode() {
		return this.nome.hashCode();	// adotado o metodo hashCode da classe String
	}
	
	@Override
	public String toString() {
		return "[Aluno: " + this.nome + ", matricula: " + this.NumeroMatricula + "]";
	}
}
