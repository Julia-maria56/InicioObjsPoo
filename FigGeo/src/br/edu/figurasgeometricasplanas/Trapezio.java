package br.edu.figurasgeometricasplanas;

public class Trapezio {
	public double bmaior;
	public double bmenor;
	public double area;
	public double altura;
	
	public void CalcArea() {
		area = ((bmaior + bmenor)*altura) / 2;
		System.out.println("O valor da �rea �, em um m�todo sem retorno e sem par�metro �: " + area);
		System.out.println(" ");
	}
	 
	public void CalcArea(double B, double b, double a) {
		area = ((bmaior + bmenor)*altura) / 2;
		bmaior = B;
		bmenor = b;
		altura = a;
		System.out.println("O valor da �rea �, em um m�todo sem retorno e com par�metro �: " + area);
		System.out.println(" ");
	}
	
	public void ListaAtributos() {
		System.out.println("O valor de todos as bases maiores �: " + bmaior);
		System.out.println("O valor de todos as bases menores �: " + bmenor);
		System.out.println("O valor de todos as alturas �: " + altura);
		System.out.println("O valor de todas as �reas �: " +area);
	  
	}
	

}






