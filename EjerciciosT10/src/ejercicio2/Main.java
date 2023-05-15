package ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
        	Hora hora = new Hora(23,58,59);
        	int cant;
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduzca la cantidad de segundos que desea incrementar");
            cant = sc.nextInt();
            hora.incrementarSegundo(cant);
        	System.out.println("Hora: " + hora.hora + ", minutos: " + hora.minuto + ", segundos: " + hora.segundo);
        }catch(NegativeHourException e) {
        	System.out.println(e);
        } catch (NegativeMinuteException e) {
			System.out.println(e);
		} catch (NegativeSecondException e) {
			System.out.println(e);
		}
    }
}