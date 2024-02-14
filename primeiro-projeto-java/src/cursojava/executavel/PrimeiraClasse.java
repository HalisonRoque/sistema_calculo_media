package cursojava.executavel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.classes.Secretario;
import cursojava.classesauxiliares.FuncaoAutenticacao;
import cursojava.constantes.StatusAluno;
import cursojava.excecao.ExcecaoProcessarNota;
import cursojava.interfaces.PermitirAcesso;

public class PrimeiraClasse {
	
	
	public static void main(String[] args) {
		
		try {
		
			lerArquivo();
		
		
		String login = JOptionPane.showInputDialog("Informe o login");
		String senha = JOptionPane.showInputDialog("Informe a senha");
		
				
				
		if (new FuncaoAutenticacao(new Secretario(login, senha)).autenticar()) {
			
			List<Aluno> alunos = new ArrayList<Aluno>();
			/* o HashMap é uma lista que dentro dela identifica uma sequencia de valores */
			HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

			/*
			 * List<Aluno> alunosAprovados = new ArrayList<Aluno>(); 
			 * List<Aluno> alunosReprovados = new ArrayList<Aluno>(); 
			 * List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
			 */

			for (int qtd = 1; qtd <= 5; qtd++) {

				/* input que mostra uma caixa de dialogo para deixar o programa dinamico */
				String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + "?");				
				String idade = JOptionPane.showInputDialog("Qual o sua idade?");
				
				
				 /*String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento?");
				 * String registroGeral = JOptionPane.showInputDialog("Qual o RG?"); 
				 * String cpf = JOptionPane.showInputDialog("Qual o CPF?");
				 * String nomeEscola = JOptionPane.showInputDialog("Qual o nome da Escola?");
				 * String nomeMae = JOptionPane.showInputDialog("Qual o nome da mae?"); 
				 * String nomePai = JOptionPane.showInputDialog("Qual o nome do pai?"); 
				 * String dataMatricula = JOptionPane.showInputDialog("Qual a data da matricula?"); 
				 * String serieMatriculada = JOptionPane.showInputDialog("Qual a serie matriculada?");
				 * 
				 * 
				 * 
				 * /* new Aluno() é uma instancia (Criação de Objeto
				 */
				/* aluno1 é uma referencia para o objeto Aluno */
				Aluno aluno1 = new Aluno();
				aluno1.setNome(nome);
				aluno1.setIdade(Integer.valueOf(idade));
				
				 /* aluno1.setDataNascimento(dataNascimento);
				 * aluno1.setRegistroGeral(registroGeral); aluno1.setNumeroCpf(cpf);
				 * aluno1.setNomeEscola(nomeEscola); aluno1.setNomeMae(nomeMae);
				 * aluno1.setNomePai(nomePai); aluno1.setDataMatricula(dataMatricula);
				 * aluno1.setSerieMatriculado(serieMatriculada);
				 */

				String materias = JOptionPane.showInputDialog("quantidade de materias:");

				/*
				 * OBS: 'for realizado para percorrer um determinado bloco de codigo onde esta
				 * se acrescentando uma lista em na classe Disciplina, usamos o for para
				 * informar dentro da lista a materia e a nota de cada materia informando e a
				 * adicionando na lista para o objeto da classe Alunio, e implimindo na tela a
				 * classe JOptionPane, informa um tipo de caixa de dialogo para deixar o codigo
				 * dinamico, pega os dados informados e guarda na variavel informada'
				 */

				aluno1.setMaterias(Integer.valueOf(materias));

				for (int pos = 1; pos <= aluno1.getMaterias(); pos++) {
					String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina " + pos + " ?");
					String notaDisciplina = JOptionPane.showInputDialog("Nota da Disciplina " + pos + " ?");

					Disciplina disciplina = new Disciplina();
					disciplina.setDisciplina(nomeDisciplina);
					disciplina.setNota(Double.valueOf(notaDisciplina));

					aluno1.getDisciplinas().add(disciplina);
				}

				int escolha = JOptionPane.showConfirmDialog(null, "deseja remover alguma disciplinas?");

				if (escolha == 0) { /* opção sim é ZERO */

					int continuarRemover = 0;
					int posicao = 1; /* representa o index para remover na lista */

					while (continuarRemover == 0) {
						String disciplinaRemover = JOptionPane.showInputDialog("qual a disciplina?");
						aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover) - posicao);
						posicao++;
						continuarRemover = JOptionPane.showConfirmDialog(null, "continuar a remover");

					}
					System.out.println(aluno1.getDisciplinas());
				}

				alunos.add(aluno1);

			}

			// variavel do hashMap
			/*
			 * para usar uma lista no hashMaps temos que colocar uma chave ja declarada e
			 * iniciar novamente uma lista de uma classe
			 */
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
				System.out.println("Resultado: \nAluno: " + aluno.getNome() + "\nStatus: " + aluno.getAlunoAprovado2()
						+ "\nMedia: " + aluno.getMediaNota());
				System.out.println("-------------------------------------------------");
			}

			System.out.println("----------------Lista de Recuperacao------------------");
			for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
				System.out.println("Resultado: \nAluno: " + aluno.getNome() + "\nStatus: " + aluno.getAlunoAprovado2()
						+ "\nMedia: " + aluno.getMediaNota());
				System.out.println("-------------------------------------------------");
			}
			System.out.println("----------------Lista de Reprovados------------------");
			for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
				System.out.println("Resultado: \nAluno: " + aluno.getNome() + "\nStatus: " + aluno.getAlunoAprovado2()
						+ "\nMedia: " + aluno.getMediaNota());
				System.out.println("-------------------------------------------------");
			}
		}else {
			JOptionPane.showMessageDialog(null, "acesso não permitido");;
		
		}
		
		/*tratando exceção do sistema*/
		}catch (NumberFormatException e) { /*captura exceção de formato de numero não compativel*/
			
			StringBuilder saida = new StringBuilder(); /*classe do java para ser trabalhado com string em execessoes */
			e.printStackTrace(); /*imprimir erro no console java é de extrema importancia, pois mostra onde esta o erro no codigo*/
			
			/*metodo da classe Exception que imprime uma mensageem de erro na qual classe ou metodo do erro*/
			System.out.println(" Mensagen: " + e.getMessage());
			
			for (int i = 0; i < e.getStackTrace().length; i++) {
			/*mostrar de maneira mais expecificada */
				
				/*esta passando o boolean*/
				saida.append("\n classe de erro: " + e.getStackTrace()[i].getClassName());
				saida.append("\n metodo de erro: " + e.getStackTrace()[i].getMethodName());
				saida.append("\n linha de erro: " + e.getStackTrace()[i].getLineNumber());
				saida.append("\n Class: " + e.getClass().getName());
				
			}
			
			JOptionPane.showMessageDialog(null,"erro de conversão de numero" + saida.toString());
		
		}catch (NullPointerException e) { /*captura uma exceção com valor null*/
			JOptionPane.showMessageDialog(null, "Opa, Null Pointer exection : " + e.getClass());
		
		}catch (Exception e) { /*captura todas as exceções que não prevemos*/
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "erro inesperado : " + e.getClass().getName());
		
		}finally { /*sempre é executado ocorrendo erros ou não. porque?*/
			/*Finally sempre é executado quando precisa executar um processo acontecendo erro ou não no sistema*/
			JOptionPane.showMessageDialog(null, "obrigado pelo aprendizado");
		}
		
	}
	
	public static void lerArquivo() throws ExcecaoProcessarNota {
		try {
			
			File fil = new File("lines.txt");	
			Scanner scanner = new Scanner(fil);
		}catch (FileNotFoundException e) {
			
			/*o throw serve para lançar a exceção na classe*/
			throw new ExcecaoProcessarNota(e.getMessage());
		}	
	}

}
