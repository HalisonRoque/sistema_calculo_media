package cursojava.interfaces;

public interface PermitirAcesso {
	/*criando metodo de autenticar para ser usado em outras classes
	 * na interface fica apenas a declaração do metodo
	 * a regra de negocio é usada nas classes que implementam seus metodos*/
	public boolean autenticar();

}
