package Calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		System.out.println("Hola Mundo, bienvenido a la Javaculator 2000");
		Scanner sc = new Scanner(System.in);
		int primerNumero;
		int segundoNumero;
		String operacion;
		
		//Pido datos		
		System.out.print("Introduce el 1º numero a operar: ");
		primerNumero = sc.nextInt();
		System.out.print("Introduce el 2º numero a operar: ");
		segundoNumero = sc.nextInt();
		System.out.print("¿Quieres 'sumar' o 'restar'? ");
		operacion = sc.next();
		
		//Muestro datos
//		System.out.println(primerNumero);
//		System.out.println(segundoNumero);
//		System.out.println(operacion);
		
		System.out.println("El resultado es: " + (primerNumero+segundoNumero));

	}

}
