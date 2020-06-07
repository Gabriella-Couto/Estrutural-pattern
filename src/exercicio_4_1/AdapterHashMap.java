package exercicio_4_1;

import java.util.HashMap;
import java.util.Map;

public class AdapterHashMap<K> extends HashMap<K, K> implements Map<K, K> {
	
	private static final long serialVersionUID = 1L;
	
	public AdapterHashMap(K[][] matriz){
		
		for( int c = 0; c < matriz[0].length; c++) {
			
			put(matriz[0][c], matriz[1][c]);
		}
		
	} 

}
