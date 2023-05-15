package ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {
	
	public static int readInt(Scanner sc) {
		int i=0;
		try {
			System.out.println("Introduzca un numero");
			i = sc.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("El valor introducido no es de tipo int");
		}
		return i;
	}
	
	public static double readDouble(Scanner sc) {
		double x=0;
		try {
			System.out.println("Introduzca un numero");
			sc.nextLine();
			x = sc.nextDouble();
		}catch(InputMismatchException e) {
			System.out.println("El valor introducido no es de tipo double");
		}
		return x;
	}
	
}
