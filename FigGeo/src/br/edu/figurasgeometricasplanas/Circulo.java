package br.edu.figurasgeometricasplanas;

public class Circulo {
	public double raio;
	public double pi;
	public double area;
	
	public Circulo() {
		raio = 0.0;
		pi = 3.14;
		area = 0.0;
	}
	
	public void CalcArea() {
		area = (pi * (raio * raio));
		System.out.println("O valor da área é, em um método sem retorno e sem parâmetro é: " + area);
		System.out.println(" ");
	}
	 
	public void CalcArea(double r) {
		area = (pi * (raio * raio));
		raio = r;
		System.out.println("O valor da área é, em um método sem retorno e com parâmetro é: " + area);
		System.out.println(" ");
	}
	
	public void ListaAtributos() {
		System.out.println("O valor de todos os raios é: " + raio);
		System.out.println("O valor de todas as áreas é: " +area);
	  
	}
	

}




