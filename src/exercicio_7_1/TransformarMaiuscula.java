package exercicio_7_1;

public class TransformarMaiuscula extends TransformaStringTemplate {
	
	@Override
	public void alterarString(String s) {
		
		s = s.toUpperCase();
		
		System.out.println("Convertido: " + s);
	
	}

}
