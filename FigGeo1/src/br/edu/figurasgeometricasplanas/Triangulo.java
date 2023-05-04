package br.edu.figurasgeometricasplanas;
import java.util.Scanner;

public class Triangulo {
	
	Scanner sc = new Scanner (System.in);
	
	private double area;
	private double base;
	private double altura;
	
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
		System.out.println("Digite o valor da base: ");
		base = sc.nextDouble();
		System.out.println("Digite o valor da altura: ");
		altura = sc.nextDouble();	
		}
	
	public double getArea() {
		return area;
	}
}
