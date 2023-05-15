package ejercicio3;

public class Fecha {
	
	private int dia;
	private int mes;
	private int año;
	
	public Fecha() {
	}

	public Fecha(int dia, int mes, int año) {
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}
	
	public boolean esBisiesto() {
		boolean bisiesto = false;
		
		if(año%4==0 && (this.año%100!=0 || this.año%400==0)){
			bisiesto=true;
		}
		
		return bisiesto;
	}
	
	public boolean fechaCorrecta() {
		boolean correcto = false;
		
		if(dia<=30&&mes!=2&&mes<=12||dia<=28&&mes==2) {
			correcto = true;
		}else if(esBisiesto()==true&&dia==29&&mes==2) {
			correcto = true;
		}
		
		return correcto;
	}
	
	public void diaSiguiente() {
		
		if(dia<30&&fechaCorrecta()==true) {
			dia++;
		}else if(dia==30&&fechaCorrecta()==true) {
			dia=1;
			mes++;
		}else if(dia==30&&mes==12&&fechaCorrecta()==true) {
			dia=1;
			mes=1;
			año++;
		}
		
	}

	@Override
	public String toString() {
		String fecha = "Fecha [0" + dia + "-" + mes + "-" + año + "]";
		
		if(dia>=1 && dia<=9) {
			fecha = "Fecha [0" + dia + "-" + mes + "-" + año + "]";
		}else if(mes>=1 && mes<=9) {
			fecha = "Fecha [" + dia + "-0" + mes + "-" + año + "]";
		}
		
		return fecha;
	}
	
	
}
