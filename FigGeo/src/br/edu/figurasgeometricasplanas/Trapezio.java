package br.edu.figurasgeometricasplanas;

public class Trapezio {
	public double bmaior;
	public double bmenor;
	public double area;
	public double altura;
	
	public void CalcArea() {
		area = ((bmaior + bmenor)*altura) / 2;
		System.out.println("O valor da área é, em um método sem retorno e sem parâmetro é: " + area);
		System.out.println(" ");
	}
	 
	public void CalcArea(double B, double b, double a) {
		area = ((bmaior + bmenor)*altura) / 2;
		bmaior = B;
		bmenor = b;
		altura = a;
		System.out.println("O valor da área é, em um método sem retorno e com parâmetro é: " + area);
		System.out.println(" ");
	}
	
	public void ListaAtributos() {
		System.out.println("O valor de todos as bases maiores é: " + bmaior);
		System.out.println("O valor de todos as bases menores é: " + bmenor);
		System.out.println("O valor de todos as alturas é: " + altura);
		System.out.println("O valor de todas as áreas é: " +area);
	  
	}
	

}






