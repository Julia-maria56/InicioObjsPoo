package br.edu.figurasgeometricasplanas;
import java.util.Scanner;

public class Retangulo {
	
	Scanner sc = new Scanner (System.in);
	private double base;
	private double altura;
	private double area;
	
	public Retangulo() {
		base = 0.0;
		altura = 0.0;
		area = 0.0;
	}
	
	public void CalcArea() {
		area = (base * altura);
		System.out.println("O valor da área é, em um método sem retorno e sem parâmetro é: " + area);
		System.out.println(" ");
	}
	 
	public void CalcArea(double b, double h) {
		area = (base * altura);	
		base = b;
		altura = h;
		System.out.println("O valor da área é, em um método sem retorno e com parâmetro é: " + area);
		System.out.println(" ");
	}
	
	public void ListaAtributos() {
		System.out.println("Digite o valor da base: ");
		base = sc.nextDouble();
		System.out.println("Digite o valor da altura: ");
		altura = sc.nextDouble(); 
	}
	
	public double getArea() {
		return area;
	}
	
}

