package cursojava.classes;

import java.util.ArrayList;
import java.util.List;

import cursojava.constantes.StatusAluno;

/*Esta é nossa classe/objeto que representa o Aluno*/

public class Aluno extends Pessoa {
	
	/*Atributos do Aluno*/
	
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	private int materias;
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	

	public int getMaterias() {
		return materias;
	}

	public void setMaterias(int materias) {
		this.materias = materias;
	}
	/*chamando a classe Disciplina e instaciando ela*/
	
	
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	
	/* contrutor Aluno */
	public Aluno() {
		
	}
	/*construtor passando um parametro*/
	public Aluno(String nomePadrao) {
		nome = nomePadrao;
	}
	/*contrutor passando dois parametros*/
	public Aluno(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}
	/* metodo SETTER do atributo (nome)*/
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome.toUpperCase();
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getRegistroGeral() {
		return registroGeral;
	}
	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}
	public String getNumeroCpf() {
		return numeroCpf;
	}
	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}
	public String getNomeMae() {
		return nomeMae.toUpperCase();
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getNomePai() {
		return nomePai.toUpperCase();
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	public String getDataMatricula() {
		return dataMatricula;
	}
	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
	public String getNomeEscola() {
		return nomeEscola.toUpperCase();
	}
	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}
	public String getSerieMatriculado() {
		return serieMatriculado;
	}
	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}
	

	
	/*metodo que retorna media do aluno*/
	public double getMediaNota() {
		
		double somaNotas = 0.0;
		
		for (Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getNota();
		}
		
		return somaNotas / disciplinas.size();
	}
	
		
	/*verificabdo se o aluno esta aprovado, em recuperação ou reprovado*/
	public String getAlunoAprovado2() {
		double media = this.getMediaNota();
		if(media >= 5) {
			if(media >= 7) {
				return StatusAluno.APROVADO;
			}else {
				return StatusAluno.RECUPERACAO;
			}
		}else {
			return StatusAluno.REPROVADO;
		}
	}
	
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado + ", materias=" + materias + ", disciplinas=" + disciplinas + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((numeroCpf == null) ? 0 : numeroCpf.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numeroCpf == null) {
			if (other.numeroCpf != null)
				return false;
		} else if (!numeroCpf.equals(other.numeroCpf))
			return false;
		return true;
	}
	
	@Override  /*identifica um metodo subescrito ----- para chamar esse metodo basta escrever o nome do metodo*/
	public boolean pessoaMaiorIdade() {
		return super.pessoaMaiorIdade();
	}
	
	public String msgMaiorIdade() {
		return this.pessoaMaiorIdade() ? "obaa você é maior de idade" : "ixxi, você não é maior de idade";
	}

	@Override /*metodo obrigatorio da classe pai Pessoa*/
	public double salario() {
		// TODO Auto-generated method stub
		return 0;
	}

}
