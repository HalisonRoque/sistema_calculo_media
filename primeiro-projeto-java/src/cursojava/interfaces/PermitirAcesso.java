package cursojava.interfaces;

public interface PermitirAcesso {
	/*criando metodo de autenticar para ser usado em outras classes
	 * na interface fica apenas a declara��o do metodo
	 * a regra de negocio � usada nas classes que implementam seus metodos*/
	public boolean autenticar();

}
