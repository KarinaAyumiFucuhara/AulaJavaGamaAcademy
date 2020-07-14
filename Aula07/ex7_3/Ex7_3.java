package ex7_3;

public class Ex7_3 {
    public static void main(String[] args) {
        
        Fila fila = new Fila();

        fila.adicionar_pessoa("Karina", "N1");
        fila.adicionar_pessoa("Henrique", "P1");
        fila.adicionar_pessoa("Roberto", "P2");
        fila.adicionar_pessoa("Andre", "N2");
        fila.adicionar_pessoa("Lucia", "N3");
        fila.adicionar_pessoa("Nilde", "N4");
        fila.adicionar_pessoa("Roy", "P3");

        System.out.println(fila.exibir_fila());


        System.out.println(fila.remover_pessoa());
    }
    
}