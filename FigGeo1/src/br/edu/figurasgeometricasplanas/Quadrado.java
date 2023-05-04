package br.edu.figurasgeometricasplanas;
import java.util.Scanner;

public class Quadrado {
	
	Scanner sc = new Scanner (System.in);
	
	private double lado1;
	private double area;
	
	public Quadrado() {
		lado1 = 0.0;
		area = 0.0;
	}
	
	public void CalcArea() {
		area = (lado1 * lado1);
		System.out.println("O valor da área é, em um método sem retorno e sem parâmetro é: " + area);
		System.out.println(" ");
	}
	 
	public void CalcArea(double l1) {
		area = (lado1 * lado1);	
		lado1 = l1;
		System.out.println("O valor da área é, em um método sem retorno e com parâmetro é: " + area);
		System.out.println(" ");
	}
	
	public void ListaAtributos() {
		System.out.println("Digite o valor do lado: ");	  
	}
	public double getArea() {
		return area;
	}
	
}

