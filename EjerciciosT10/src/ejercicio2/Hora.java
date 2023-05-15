package ejercicio2;

public class Hora {
    int hora;
    int minuto;
    int segundo;

    public Hora(int hora, int minuto, int segundo) throws NegativeHourException, NegativeMinuteException, NegativeSecondException {
    	 if (hora<=24 && hora>=0){
             this.hora = hora;
         }else if(hora<0){
         	throw new NegativeHourException();
         }
    	 if (minuto<60 && minuto>=0){
             this.minuto = minuto;
         }else if(minuto<0){
         	throw new NegativeMinuteException();
         }
    	 if (segundo<60 && segundo>=0){
             this.segundo = segundo;
         }else if(segundo<0){
         	throw new NegativeSecondException();
         }
    }
    public Hora(){
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) throws NegativeHourException {
        if (hora<=24 && hora>=0){
            this.hora = hora;
        }else if(hora<0){
        	throw new NegativeHourException();
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) throws NegativeMinuteException {
        if (minuto<60 && minuto>=0){
            this.minuto = minuto;
        }else if(minuto<0){
        	throw new NegativeMinuteException();
        }
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) throws NegativeSecondException {
        if (segundo<60 && segundo>=0){
            this.segundo = segundo;
        }else if(segundo<0){
        	throw new NegativeSecondException();
        }
    }
    public void incrementarSegundo(int cant){
        
        for (int i = 0; i < cant; i++) {
        	
            if(segundo==59) {
                segundo=0;
                
                if(minuto==59) {
                    minuto=0;
                    
                    if(hora==23) hora=0;
                    else hora++;
                }else minuto++;
            }else segundo++;
        }
    }
}
