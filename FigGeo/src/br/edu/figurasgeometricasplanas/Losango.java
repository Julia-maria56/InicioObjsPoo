package br.edu.figurasgeometricasplanas;
import java.util.Scanner;

public class Losango {
	
	Scanner sc = new Scanner (System.in);
	private double dmaior;
	private double dmenor;
	private double area;
	
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
		System.out.println("Digite o valor da diagonal maior : " );
		dmaior = sc.nextDouble();
		System.out.println("Digite o valor da diagonal menor : " );
		dmenor = sc.nextDouble();
	  
	}
	public double getArea() {
		return area;
	}
	
	public double getVolume() {
		return area;
	}

}

