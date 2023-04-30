package br.edu.figurasgeometricasplanas;
import java.util.Scanner;
import java.lang.Math.*;


public class Circulo {
	
	Scanner sc = new Scanner (System.in);
	private double raio;
	private double area;
	
	public Circulo() {
		raio = 0.0;
		area = 0.0;
	}
	
	public void CalcArea() {
		area = (Math.PI * (raio * raio));
		System.out.println("O valor da área é, em um método sem retorno e sem parâmetro é: " + area);
		System.out.println(" ");
	}
	 
	public void CalcArea(double r) {
		area = (Math.PI * (raio * raio));
		raio = r;
		System.out.println("O valor da área é, em um método sem retorno e com parâmetro é: " + area);
		System.out.println(" ");
	}
	
	public void ListaAtributos() {
		System.out.println("Digite o valor do raio: ");
		raio = sc.nextDouble();
	}
	
	public double getArea() {
		return area;
	}	

}
