package exercicio_4_1;

import java.util.Map;
import java.util.TreeMap;

public class AdapterTreeMap<K> extends TreeMap<K, K> implements Map<K, K> {

	private static final long serialVersionUID = 1L;
	
	public AdapterTreeMap(K[][] matriz) {
		
		for (int c = 0 ; c < matriz[0].length; c++ ) {
			
			put(matriz[0][c], matriz[1][c]);
		}
	}

}
