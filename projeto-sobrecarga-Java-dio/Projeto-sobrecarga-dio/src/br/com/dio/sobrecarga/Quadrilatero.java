package br.com.dio.sobrecarga;

public class Quadrilatero {
public static void area(double lado) {
	System.out.println("�rea do quadrado: "+ lado*lado);
}
public static void area (double lado1, double lado2) {
	System.out.println("�rea do retangulo: "+ lado1 * lado2);
}
public static void area (double baseMaior, double baseMenor, double altura) {
	System.out.println("�rea do trapezio: "+((baseMaior+baseMenor)*altura)/2);
}
}
