package exs.exRelogio;

public class Relogio {
    private int hora, min, segundo;

    /*
    Relogio(int hora, int min, int segundo) {
        this.hora = hora;
        this.min = min;
        this.segundo = segundo;
    }
    */
  

    public void setHora(int hora) {
        if(hora >= 0 && hora < 24) {
            this.hora = hora;
        }else {
            System.out.println("Hora inválida - Será colocado 00h");
            this.hora = 0;
        }
        
    }

    public void setMin(int min) {
        if(min >= 0 && min < 60) {
            this.min = min;
        }else {
            System.out.println("Minuto inválido - Será colocado 00min");
            this.min = 0;
        }
        
    }

    public void setSegundo(int segundo) {
        if(segundo >= 0 && segundo < 60) {
            this.segundo = segundo;
        }else {
            System.out.println("Segundo inválido - Será colocado 00s");
            this.segundo = 0;
        }
        
    }

    public String exibirRelogio() {
        
        return String.format("Horário:%02d:%02d:%02d", hora, min, segundo);
    }

    
}