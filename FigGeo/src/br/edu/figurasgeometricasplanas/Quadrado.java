package br.edu.figurasgeometricasplanas;

public class Quadrado {
	public double lado1;
	public double lado2;
	public double area;
	
	public Quadrado() {
		lado1 = 0.0;
		lado2 = 0.0;
		area = 0.0;
	}
	
	public void CalcArea() {
		area = (lado1 * lado2);
		System.out.println("O valor da área é, em um método sem retorno e sem parâmetro é: " + area);
		System.out.println(" ");
	}
	 
	public void CalcArea(double l1, double l2) {
		area = (lado1 * lado2);	
		lado1 = l1;
		lado2 = l2;
		System.out.println("O valor da área é, em um método sem retorno e com parâmetro é: " + area);
		System.out.println(" ");
	}
	
	public void ListaAtributos() {
		System.out.println("O valor de todas s lados é: " + lado1);
		System.out.println("O valor de todas as áreas é: " +area);
	  
	}
	

}


