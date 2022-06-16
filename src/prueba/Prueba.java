package prueba;

import java.util.Scanner;

public class Prueba {
	public static void main(String[] args) {
		System.out.println("Hola Mundo programita de prueba de pedir datos y mostrarlos");
		System.out.println ("Por favor introduzca una cadena por teclado:");

        String entradaTeclado = "";

        Scanner entradaEscaner = new Scanner (System.in);
        entradaTeclado = entradaEscaner.nextLine ();
        System.out.println ("Entrada recibida por teclado es: \"" + entradaTeclado +"\"");
		
        entradaEscaner.close();
	}

}
