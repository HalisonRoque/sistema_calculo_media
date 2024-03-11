package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Disciplina;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.setNome("halison roque");
		aluno.setSerieMatriculado("4º ano");
		
		
		
		Diretor diretor = new Diretor();
		diretor.setNome("heitor");
		diretor.setRegistroEducacao("454564518456");
		
		Secretario secretario = new Secretario();
		secretario.setNome("carlos");
		secretario.setExperiencia("adminstraçao");
		secretario.setNumeroCpf("154545121545");
		
		System.out.println(secretario);
		System.out.println(aluno);
		System.out.println(diretor);
		
		teste(aluno);
		teste(secretario);
		teste(diretor);
		
		
		
	}
	
	public static void teste(Pessoa pessoa) {
		System.out.println("Essa pessoa é demais = " 
		+ pessoa.getNome() + " e o salario é de = " + pessoa.salario() );
	}
}
