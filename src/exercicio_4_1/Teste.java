package exercicio_4_1;

import java.util.Map;

public class Teste {

	public static void main(String[] args) {

		Integer[][] matrizHashMap = new Integer[][] {{1,2,3,4,5,6,7,8,9,10},{2,4,6,8,10,12,14,16,18,20}};
		Integer[][] matrizTreeMap = new Integer[][] {{1,2,3,4,5,6,7,8,9,10},{1,2,4,8,16,32,64,128,256,512}};

		Map<Integer, Integer> testeHashMap = new AdapterHashMap<Integer>(matrizHashMap);
		
		System.out.println("Resultado do HashMap");
		
		for (Integer key: testeHashMap.keySet()) {
			
			System.out.println(key + " = " + testeHashMap.get(key));
		}
		
		Map<Integer, Integer> testeTreeMap = new AdapterTreeMap<Integer>(matrizTreeMap);
		
		System.out.println("Resultado do TreeMap");
		
		for (Integer key: testeTreeMap.keySet()) {
			
			System.out.println(key + " = " + testeTreeMap.get(key));
		}
		

	}

}
