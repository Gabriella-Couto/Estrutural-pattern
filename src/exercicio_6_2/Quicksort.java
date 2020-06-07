package exercicio_6_2;

public class Quicksort implements Ordenacao {

	@Override
	public int[] ordenar(int[] v) {
		quicksort(v , 0 , v.length -1);
		
		return v;
	}
	
	public void quicksort(int v[], int p, int r) {
		if (p < r) {
			int j = separa(v, p, r);
			quicksort(v, p, j - 1);
			quicksort(v, j + 1, r);
		}
	}
	
	private int separa(int v[], int p, int r) {
		
		int c = v[p];
		int i = p + 1, j = r;
		while (i<=j) {
			if(v[i] <= c)
				i++;
			else if (c < v[j])
				j--;
				
			else {
				int troca = v[i];
				v[i] = v[j];
				v[j] = troca;
				i++;
				j--;
			}
		}
		
		v[p] = v[j];
		v[j] = c;
		
		return j;
		
	}

}
