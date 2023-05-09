package br.edu.figurasgeometricasplanas;

public class Triangulo extends FigPlanas{
	
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
		System.out.println(area);
	}


	public void setBase(double base) {
		this.base = base;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
}
