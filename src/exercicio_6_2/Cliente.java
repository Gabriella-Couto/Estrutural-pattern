package exercicio_6_2;

import javax.swing.JOptionPane;

public class Cliente {

	public static void main(String[] args) {
		
		 int quantidade = 10000;
         int[] vetor = new int[quantidade];

         for (int i = 0; i < vetor.length; i++) {
                 vetor[i] = (int) (Math.random()*quantidade);
                 
         }
	
         int i = Integer.parseInt(JOptionPane.showInputDialog("Escolha a Ordenação: \n 1 para BubbleSort \n 2 para InsertionSort \n 3 para SelectionSort\n 4 para QuickSort"));
         
		Ordenacao ord = escolhaOrdenacao(i);
		
		long tempoInicial = System.currentTimeMillis();
		
		vetor = ord.ordenar(vetor); 
		
		long tempoFinal = System.currentTimeMillis();
		
		for(int n = 0 ; n < vetor.length ; n++) {
			
			System.out.println(vetor[n]);
		}
		
		 System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms");

	}
	
	
	public static Ordenacao escolhaOrdenacao(int i) {
		Ordenacao ord;
		switch(i) {
		case 1:
			ord = new BubbleSort();
			break;
		case 2:
			ord = new InsertionSort();
			break;
		case 3:
			ord = new SelectionSort();
			break;
		case 4:
			ord = new Quicksort();
			break;
		default:
			ord = null;
		}
		
		return ord;
		
	}

}
