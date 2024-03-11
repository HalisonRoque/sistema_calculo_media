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
		
		
		/*percorrendo uma matriz
		 * fazemos primeiro um for para percorrer as linhas depois outro for para percorrer as colunas*/
		for(int posLinha = 0; posLinha < notas.length; posLinha++) {
		
			for(int posColuna = 0; posColuna < notas[posLinha].length; posColuna++) {
				/*OBSERVE QUE EXISTE DOIS COLCHETES PARA PERCORRER A MATRIZ*/
				System.out.println("valor da matriz= " + notas[posLinha][posColuna]);
			}
		}
		
		
	}

}
