package br.edu.figurasgeometricasespaciais;
import java.util.Scanner;

public class Piramide {
	// Base quadrada
	
	Scanner sc = new Scanner(System.in);
	
	private double arestabase;
	private double altura;
	private double areatotal;
	private double apotema;
	private double areaface;
	private double areabase;
	private double volume;
	
	
	public Piramide() {
		arestabase = 0.0;
		areatotal = 0.0;
		apotema = 0.0;
		areaface = 0.0;
		areabase = 0.0;
		volume = 0.0;
		altura = 0.0;
	}
	
	public void calcAreaTotal() {
		areabase = arestabase * arestabase;
		areaface = arestabase * apotema / 2;
		areatotal =  areabase * (4 *areaface);	
		System.out.println("O valor da área é: " + areatotal);
		System.out.println(" ");
	}
	 
	public void calcVolume() {
		volume = areabase * altura;
		System.out.println("O valor do volume é: " + volume);
		System.out.println(" ");
	}
	
	public void ListaAtributos() {
		System.out.println("Digite o valor da aresta: ");
		arestabase = sc.nextDouble();
		System.out.println("Digite o valor da altura: ");
		altura = sc.nextDouble();
		System.out.println("Digite o valor da apótema: ");
		apotema = sc.nextDouble();
	}
	
		public double getArea() {
			return areatotal;
		}
		public double getVolume() {
			return volume;
		}
		

	
	
}

	
	
	
	
	
	
	
