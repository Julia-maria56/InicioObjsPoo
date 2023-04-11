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
		System.out.println("O valor da área é, em um método sem retorno e sem parâmetro é: " + area);
		System.out.println(" ");
	}
	 
	public void CalcArea(double Dmaior, double d) {
		area = (dmaior * dmenor) / 2;
		dmaior = Dmaior;
		dmenor = d;
		System.out.println("O valor da área é, em um método sem retorno e com parâmetro é: " + area);
		System.out.println(" ");
	}
	
	public void ListaAtributos() {
		System.out.println("O valor de todos as diagonais maiores é: " + dmaior);
		System.out.println("O valor de todos as diagonais menores é: " + dmenor);
		System.out.println("O valor de todas as áreas é: " +area);
	  
	}
	

}



