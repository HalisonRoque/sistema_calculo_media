package cursojava.thread;

/*Thread são rotinas que executam novas funções por tras do codigo principal, onde o 
 * usuario não precisa ver a sua execução*/
public class AulaThread {
	public static void main(String[] args) throws InterruptedException {
		 for (int pos = 0; pos < 10; pos++) {
			 
			 
			 Thread.sleep(2000); /*da um tempo para executar o codigo*/ 
			 
			 /*executando esse envio com o tempo determinado*/
			 System.out.println("executando algo de rotina, por exemplo envio de e-mail " + pos);
		 }
	}
}
