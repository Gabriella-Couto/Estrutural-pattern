package exercicio_7_2;

import java.util.Arrays;

public class TesteDoubleComparador {

	public static void main(String[] args) {
		DoubleCompador[] db = new DoubleCompador[10];
		
		for(int i = 0; i < 10; i++) {
			db[i] = new DoubleCompador(Math.floor(10*Math.random())+Math.random());
			System.out.println(db[i].doubleValue());
		}
		
		Arrays.sort(db);
		
		System.out.println("Ordenado somente pelas casas decimais.");
		System.out.println(Arrays.toString(db));
		
		
	}

}
