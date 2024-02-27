package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {
	
	/*usado para executar codigo*/
	public static void main(String[] args) {

	Aluno aluno = new Aluno();
	aluno.setNome("halison");
	aluno.setIdade(27);
	
	
	Disciplina disciplina1 = new Disciplina();
	disciplina1.setDisciplina("java");
	double[] notas = {5.4, 6.4, 7.8, 5.9};
	disciplina1.setNota(notas);
	
	aluno.getDisciplinas().add(disciplina1);
	
	
	
	Disciplina disciplina2 = new Disciplina();
	disciplina2.setDisciplina("node.js");
	double[] notasNode = {7.4, 5.2, 9.4, 8.6};
	disciplina2.setNota(notasNode);
	
	aluno.getDisciplinas().add(disciplina2);

	
	System.out.println("Nome do aluno = " + aluno.getNome());
	/*percorrendo as disciplinas do aluno*/
	for (Disciplina disci : aluno.getDisciplinas()) {
		System.out.println("------------------Disciplinas do aluno -----------------");
		System.out.println("Disciplina : " + disci.getDisciplina());
		System.out.println("notas:");
		
		double notaMax = 0.0;
		
		/*percorrendo as notas do aluno*/
		for(int pos = 0; pos < disci.getNota().length; pos++) {
			System.out.println("\t"+ disci.getNota()[pos]);
			
			/*descobrindo a maios nota do array*/
			if(pos == 0) {
				notaMax = disci.getNota()[pos];
			} else {
				if(disci.getNota()[pos] > notaMax) {
					notaMax = disci.getNota()[pos];
				}
			}
		}
		
		System.out.println("a maior nota " + notaMax);
		System.out.println(aluno.getAlunoAprovado2());
	}
	
	
	
	}

}
