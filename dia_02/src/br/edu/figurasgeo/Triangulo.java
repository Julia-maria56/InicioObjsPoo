package br.edu.figurasgeo;

public class Triangulo {
public double area;
public double base;
public double altura;

public void CalcArea1() {
area = (base * altura) / 2;
System.out.println("O valor da área é, em um método sem retorno e sem parâmetro é: " + area);
System.out.println(" ");
}

public double CalcArea2() {
area = (base * altura) / 2;
System.out.println("O valor da área é, em um método com retorno e sem parâmetro é: " + area);
return area;  
}

public void CalcArea3(double b, double h) {
area = (base * altura) / 2;
System.out.println(" ");
System.out.println("O valor da área é, em um método sem retorno e com parâmetro é: " + area);
System.out.println(" ");
}


public void ListaAtributos() {
System.out.println("O valor de todas as áreas é: " +area);
System.out.println("O valor de todas as bases é: " +base);
System.out.println("O valor de todas as altura é: " +altura);
}

}