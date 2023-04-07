package br.edu.principal;

import br.edu.figurasgeo.*;

public class Principal {

public static void main(String[] args) {

Triangulo objT1 = new Triangulo();
objT1.altura = 5;
objT1.base = 3;
objT1.area = 7.5;

System.out.println("O valor da altura é: " + objT1.altura);
System.out.println("O valor da base é: " + objT1.base);
System.out.println("O valor da área é: " + objT1.area);

System.out.println(" ");
//System.out.println("A área do objeto é: " +(obj.altura*obj.base)/2);
//System.out.println("A área do objeto é: " +obj.area);

objT1.CalcArea1();

double result = objT1.CalcArea2();
System.out.println(result);

objT1.CalcArea3 (objT1.base, objT1.altura);

objT1.ListaAtributos();



}

}
