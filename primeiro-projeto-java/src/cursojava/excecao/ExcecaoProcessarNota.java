package cursojava.excecao;


/*toda excecao extends da clase exception*/
public class ExcecaoProcessarNota extends Exception {
	
	public ExcecaoProcessarNota(String erro) { 
		super("erro no processamento de notas do aluno " + erro);
	}

}
