package cursojava.classes;

import cursojava.interfaces.PermitirAcesso;

public class Secretario extends Pessoa implements PermitirAcesso{
	/*classe secretario extendendo da classe pai (Pessoa) e implementando da interface (PermitirAcesso)*/
	
	private String registro;
	private String nivelCargo;
	private String experiencia;
	
	private String login;
	private String senha;
	
	/*construtor para exigir que o secretario passe sempre o login e senha*/
	public Secretario(String login, String senha) {	
		this.login = login;
		this.senha = senha;
	}
	
	/*construto padr�o sem nenhum valor informado*/
	public Secretario() {		
	}

	
	
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public String getNivelCargo() {
		return nivelCargo;
	}
	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	@Override
	public String toString() {
		return "Secretario [registro=" + registro + ", nivelCargo=" + nivelCargo + ", experiencia=" + experiencia
				+ ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + "]";
	}
	@Override /*metodo obrigatorio da classe pai Pessoa*/
	public double salario() {
		// TODO Auto-generated method stub
		return 1750 * 0.9;
	}
	
	/*implemento da interface "PermitiAcesso"*/
	/*esse � o metodo de verificar a autentifica��o*/
	@Override
	public boolean autenticar(String login, String senha) {	
		this.login = login;
		this.senha = senha;
		return autenticar();
	}
	@Override
	public boolean autenticar() {		
		return login.equals("admin") && senha.equals("admin");
	}
	


	
	

}
