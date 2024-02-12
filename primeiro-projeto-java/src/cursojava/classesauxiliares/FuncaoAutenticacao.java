package cursojava.classesauxiliares;

import cursojava.interfaces.PermitirAcesso;

/*realmente e somente receber alguem que tenha o contrato da interface PermitirAcesso
 * e chamar o metodo autenticar()*/
public class FuncaoAutenticacao {
	
	
	private PermitirAcesso permitirAcesso;
	/*no parametro passado nesse metodo passamos a interface PermitirAceso*/
	public boolean autenticar() {
		return permitirAcesso.autenticar();
	}
	
	
	public FuncaoAutenticacao(PermitirAcesso acesso) { 
		this.permitirAcesso = acesso;
	}
}
