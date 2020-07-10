package exs.ex5_1;

public class Placar {
    String time1, time2;
    private int gols_time1, gols_time2;

    public Placar() {
        this.time1 = "TimeA";
        this.time2 = "TimeB";
        this.gols_time1 = 0;
        this.gols_time2 = 0;
    }

    Placar(String time1, String time2) {
        this.time1 = time1;
        this.time2 = time2;
        this.gols_time1 = this.gols_time2 = 0;
    }

    public Placar(String time1, String time2, int gols_time1, int gols_time2) {
        this.time1 = time1;
        this.time2 = time2;
        this.gols_time1 = gols_time1;
        this.gols_time2 = gols_time2;
    }

    public String exibir_placar() {
        return(time1 + " " + gols_time1 + " X " + gols_time2 + " " + time2);
    }

    public int obterGolsTime1() {
        return gols_time1;
    }

    public void time1FezGol() {
        gols_time1++;
    }

    public int getGols_time2() {
        return gols_time2;
    }

    public void setGols_time2(int gols_time2) {
        if(gols_time2>0) {
            this.gols_time2 = gols_time2;
        }
        
    }

}