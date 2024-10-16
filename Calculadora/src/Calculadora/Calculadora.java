package Calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        System.out.println("Hola Mundo, bienvenido a la Javaculator 2000");
        Scanner sc = new Scanner(System.in);
        int primerNumero;
        int segundoNumero;
        String operacion;
        String seguir;

        do {
            System.out.println("¿Quieres hacer cuentas? Y/n");
            seguir = sc.nextLine().toLowerCase();  // Convertimos la entrada a minúsculas
            if (seguir.equals("y")) {
                // Pedir datos al usuario
                System.out.println("Introduce el 1º numero a operar: ");
                primerNumero = sc.nextInt();
                System.out.println("Introduce el 2º numero a operar: ");
                segundoNumero = sc.nextInt();
                sc.nextLine();  // Consumir el salto de línea después de nextInt()

                System.out.println("¿Quieres 'sumar', 'restar', 'multi' o 'divi'? ");
                operacion = sc.nextLine().toLowerCase();  // Convertimos la operación a minúsculas

                // Operaciones
                if (operacion.equals("sumar")) {
                    System.out.println("El resultado es: " + (primerNumero + segundoNumero));
                } else if (operacion.equals("restar")) {
                    System.out.println("El resultado es: " + (primerNumero - segundoNumero));
                } else if (operacion.equals("multi")) {
                    System.out.println("El resultado es: " + (primerNumero * segundoNumero));
                } else if (operacion.equals("divi")) {
                    if (segundoNumero != 0) {
                        System.out.println("El resultado es: " + (primerNumero / segundoNumero));
                    } else {
                        System.out.println("Error: no se puede dividir entre 0.");
                    }
                } else {
                    System.out.println("No te entiendo");
                }
            }
        } while (seguir.equals("y"));  // Repetimos el ciclo si el usuario quiere continuar

        System.out.println("Gracias por usar la Javaculator 2000. ¡Hasta la próxima!");
        sc.close();  // Cerrar el Scanner al finalizar
    }
}
