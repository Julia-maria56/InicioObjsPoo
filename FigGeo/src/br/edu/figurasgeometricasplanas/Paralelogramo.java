package br.edu.figurasgeometricasplanas;

public class Paralelogramo {
	public double base;
	public double altura;
	public double area;
	
	public Paralelogramo() {
		base = 0.0;
		altura = 0.0;
		area = 0.0;
	}
	
	public void CalcArea() {
		area = (base * altura);
		System.out.println("O valor da �rea �, em um m�todo sem retorno e sem par�metro �: " + area);
		System.out.println(" ");
	}
	 
	public void CalcArea(double b, double h) {
		area = (base * altura);	
		base = b;
		altura = h;
		System.out.println("O valor da �rea �, em um m�todo sem retorno e com par�metro �: " + area);
		System.out.println(" ");
	}
	
	public void ListaAtributos() {
		System.out.println("O valor de todas as bases �: " + base);
		System.out.println("O valor de todas as bases �: " + altura);
		System.out.println("O valor de todas as �reas �: " +area);
	  
	}
	

}




