package br.com.alura.java.collections.teste;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAlunoIterator {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", 
				"Alex Albert");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
		
		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17645);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Todos os alunos matriculados: ");
		
		// Método de percorrer os elementos do Set antes do Java 5 (2004).
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();
		while(iterador.hasNext()) {
			Aluno proximo = iterador.next();
			System.out.println(proximo);
		}
		System.out.println("-----------");
		// Método de percorrer os elementos do Set antes do Java 8
		for(Aluno a : javaColecoes.getAlunos()) {
			System.out.println(a);
		}
		System.out.println("-----------");
		javaColecoes.getAlunos().forEach(a -> {
			System.out.println(a);
		});
	}
}
