package br.edu.figurasgeometricasplanas;

public class Losango {
	public double dmaior;
	public double dmenor;
	public double area;
	
	public Losango() {
		dmaior = 0.0;
		dmenor = 0.0;
		area = 0.0;
	}
	
	public void CalcArea() {
		area = (dmaior * dmenor) / 2;
		System.out.println("O valor da �rea �, em um m�todo sem retorno e sem par�metro �: " + area);
		System.out.println(" ");
	}
	 
	public void CalcArea(double Dmaior, double d) {
		area = (dmaior * dmenor) / 2;
		dmaior = Dmaior;
		dmenor = d;
		System.out.println("O valor da �rea �, em um m�todo sem retorno e com par�metro �: " + area);
		System.out.println(" ");
	}
	
	public void ListaAtributos() {
		System.out.println("O valor de todos as diagonais maiores �: " + dmaior);
		System.out.println("O valor de todos as diagonais menores �: " + dmenor);
		System.out.println("O valor de todas as �reas �: " +area);
	  
	}
	

}



