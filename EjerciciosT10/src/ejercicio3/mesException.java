package ejercicio3;

public class mesException extends Exception{
	@Override
	public String toString() {
		return "El mes introducido no es valido";
	}
}
