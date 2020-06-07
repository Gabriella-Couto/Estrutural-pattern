package exercicio_7_1;

import javax.swing.JOptionPane;

public class TranformarTeste {

	public static void main(String[] args) {
		
		TransformaStringTemplate tst;
		
		String s = JOptionPane.showInputDialog("Digita uma string");
		
		System.out.println("Transforma em Maiuscula");
		tst = new TransformarMaiuscula();
		tst.tranformar(s);
		System.out.println("//////////////////////");
		
		System.out.println("Transforma em Minuscula");
		tst = new TransformarMinuscula();
		tst.tranformar(s);
		System.out.println("//////////////////////");
		
		System.out.println("Transforma em Duplicar");
		tst = new TransformarDuplicar();
		tst.tranformar(s);
		System.out.println("//////////////////////");
		
		System.out.println("Transforma em Inverter");
		tst = new TransformarInvertido();
		tst.tranformar(s);
		System.out.println("//////////////////////");

	}

}
