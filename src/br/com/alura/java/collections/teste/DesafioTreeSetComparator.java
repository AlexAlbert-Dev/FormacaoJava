package br.com.alura.java.collections.teste;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class OrdenaPorIdade implements Comparator<FuncionarioDesafio> {
	@Override
	public int compare(FuncionarioDesafio funcionario, FuncionarioDesafio outroFuncionario) {
		return funcionario.getIdade() - outroFuncionario.getIdade();
	}
}

class FuncionarioDesafio {
	private String nome;
    private int idade;

    public FuncionarioDesafio(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    } 

    public void setNome(String nome) {

        this.nome = nome;

    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

class DesafioTreeSetComparator {
	public static void main(String[] args) {
		FuncionarioDesafio f1 = new FuncionarioDesafio("Neymar", 33);
		FuncionarioDesafio f2 = new FuncionarioDesafio("Messi", 31);
		FuncionarioDesafio f3 = new FuncionarioDesafio("Cristiano", 32);
		
		Set<FuncionarioDesafio> funcionarios = new TreeSet<> (new OrdenaPorIdade());
		funcionarios.add(f1);
		funcionarios.add(f2);
		funcionarios.add(f3);
		
		Iterator<FuncionarioDesafio> iterador = funcionarios.iterator();
		while(iterador.hasNext()) {
			System.out.println(iterador.next().getNome());
		}
	}
}

