package cursojava.executavel;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		
		for(int i = 0; i<=10; i++) {
			int resultado = x * i;
			System.out.println(x + " X " + i + " = " + resultado);
			
			if(resultado % 2 == 0) {
				System.out.println("NUMERO PAR");
			}else {
				System.out.println("NUMERO IMPAR");
			}
		}
		
		
	

	}

}
