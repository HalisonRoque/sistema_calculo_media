package cursojava.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.constantes.StatusAluno;

public class PrimeiraClasse {
	
	
	public static void main(String[] args) {
		
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		/*o HashMap � uma lista que dentro dela identifica uma sequencia de valores*/
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
		
		/*List<Aluno> alunosAprovados = new ArrayList<Aluno>();
		List<Aluno> alunosReprovados = new ArrayList<Aluno>();
		List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();*/
		
		
		for (int qtd = 1; qtd <= 5; qtd++) {
			
		/*input que mostra uma caixa de dialogo para deixar o programa dinamico*/
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno "+ qtd +"?");
		/*String idade = JOptionPane.showInputDialog("Qual o sua idade?");
		String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento?");
		String registroGeral = JOptionPane.showInputDialog("Qual o RG?");
		String cpf = JOptionPane.showInputDialog("Qual o CPF?");
		String nomeEscola = JOptionPane.showInputDialog("Qual o nome da Escola?");
		String nomeMae = JOptionPane.showInputDialog("Qual o nome da mae?");
		String nomePai = JOptionPane.showInputDialog("Qual o nome do pai?");
		String dataMatricula = JOptionPane.showInputDialog("Qual a data da matricula?");
		String serieMatriculada = JOptionPane.showInputDialog("Qual a serie matriculada?");
		
				
		
		/* new Aluno() � uma instancia (Cria��o de Objeto*/
		/* aluno1 � uma referencia para o objeto Aluno*/
		Aluno aluno1 = new Aluno();	
		aluno1.setNome(nome);
		/*aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(registroGeral);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeEscola(nomeEscola);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setSerieMatriculado(serieMatriculada);*/
		
		String materias = JOptionPane.showInputDialog("quantidade de materias:");
		
		/* OBS: 'for realizado para percorrer um determinado bloco de codigo onde esta se acrescentando uma lista
		 * em na classe Disciplina, usamos o for para informar dentro da lista a materia e a nota de cada materia
		 * informando e a adicionando na lista para o objeto da classe Alunio, e implimindo na tela
		 * a classe JOptionPane, informa um tipo de caixa de dialogo para deixar o codigo dinamico, 
		 * pega os dados informados e guarda na variavel informada' */
		
		aluno1.setMaterias(Integer.valueOf(materias));
		
		for(int pos = 1; pos <= aluno1.getMaterias(); pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina "+ pos + " ?" );
			String notaDisciplina = JOptionPane.showInputDialog("Nota da Disciplina "+ pos + " ?" );
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
		}
		
		
		int escolha = JOptionPane.showConfirmDialog(null, "deseja remover alguma disciplinas?");
		
		if (escolha == 0) { /*op��o sim � ZERO*/
			
			int continuarRemover = 0;
			int posicao = 1; /*representa o index para remover na lista*/
			
			while(continuarRemover == 0) {
				String disciplinaRemover = JOptionPane.showInputDialog("qual a disciplina?");
				aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover) - posicao);
				posicao++;
				continuarRemover = JOptionPane.showConfirmDialog(null,"continuar a remover");
				
			}
			System.out.println(aluno1.getDisciplinas());
		}
		
		alunos.add(aluno1);
		
		}
		
		// variavel do hashMap
		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
		
		
		for (Aluno aluno : alunos) {
			if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
				maps.get(StatusAluno.APROVADO).add(aluno);
				
			} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				maps.get(StatusAluno.RECUPERACAO).add(aluno);
				
			} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)) {
				maps.get(StatusAluno.REPROVADO).add(aluno);
			}
		}
		
		
		System.out.println("----------------Lista de Aprovados------------------");		
		for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
			System.out.println("Resultado: \nAluno: " + aluno.getNome() + "\nStatus: " + aluno.getAlunoAprovado2() + "\nMedia: " + aluno.getMediaNota());
			System.out.println("-------------------------------------------------");
		}
	
		System.out.println("----------------Lista de Recuperacao------------------");		
		for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
			System.out.println("Resultado: \nAluno: " + aluno.getNome() + "\nStatus: " + aluno.getAlunoAprovado2() + "\nMedia: " + aluno.getMediaNota());
			System.out.println("-------------------------------------------------");
		}
		System.out.println("----------------Lista de Reprovados------------------");		
		for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
			System.out.println("Resultado: \nAluno: " + aluno.getNome() + "\nStatus: " + aluno.getAlunoAprovado2() + "\nMedia: " + aluno.getMediaNota());
			System.out.println("-------------------------------------------------");
		}
		
	}

}