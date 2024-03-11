package cursojava.executavel;

public class Matriz {
	
	public static void main(String[] args) {
		/*um matriz, é um array dentro de outro array sua sintaxe é com [][]*/
		int notas[][] = new int[2][3];
		
		notas[0][0] = 80;
		notas[0][1] = 70;
		notas[0][2] = 50;
		
		notas[1][0] = 80;
		notas[1][1] = 55;
		notas[1][2] = 80;
		
		
		
		
		System.out.println(notas[0][1]);
		System.out.println(notas[1][1]);
		
		
	}

}
