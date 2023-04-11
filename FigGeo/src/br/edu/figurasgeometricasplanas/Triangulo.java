package br.edu.figurasgeometricasplanas;

public class Triangulo {
	public double area;
	public double base;
	public double altura;
	
	public Triangulo() {
		base = 0.0;
		altura = 0.0;
		area = 0.0;
	}
	
	
	public void CalcArea() {
		area = (base * altura) / 2;
		System.out.println("O valor da área é, em um método sem retorno e sem parâmetro é: " + area);
		System.out.println(" ");
	}
	 
	public void CalcArea(double b, double h) {
		area = (base * altura) / 2;
		base = b;
		altura  = h;
		System.out.println(" ");
		System.out.println("O valor da área é, em um método sem retorno e com parâmetro é: " + area);
		System.out.println(" ");
	}
	
	public void ListaAtributos() {
		System.out.println("O valor de todas as áreas é: " +area);
		System.out.println("O valor de todas as bases é: " +base);
		System.out.println("O valor de todas as altura é: " +altura);
	}
	
}



