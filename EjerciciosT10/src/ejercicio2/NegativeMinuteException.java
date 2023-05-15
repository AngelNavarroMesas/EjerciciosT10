package ejercicio2;

public class NegativeMinuteException extends Exception{
	@Override
	public String toString() {
		return "Error los minutos introducidos son negativos";
	}
}
