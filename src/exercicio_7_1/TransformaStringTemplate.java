package exercicio_7_1;


public abstract class TransformaStringTemplate {
	
	public final void tranformar(String s) {
		
		alterarString(s);
		
	}
	
	public void alterarString(String s) {
		
		
		System.out.println("Convertido: " + s);
	
	}

}
