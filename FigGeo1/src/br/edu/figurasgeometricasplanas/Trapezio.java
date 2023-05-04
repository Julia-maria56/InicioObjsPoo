package br.edu.figurasgeometricasplanas;
import java.util.Scanner;

public class Trapezio {
	
	Scanner sc = new Scanner (System.in);
	private double bmaior;
	private double bmenor;
	private double area;
	private double altura;
	
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
		System.out.println("Digite o valor da base maior: ");
		bmaior = sc.nextDouble();
		System.out.println("Digite o valor da base menor: ");
		bmenor = sc.nextDouble();
		System.out.println("Digite o valor da altura: ");
		altura = sc.nextDouble();  
	}
	public double getArea() {
		return area;
	}
	

}