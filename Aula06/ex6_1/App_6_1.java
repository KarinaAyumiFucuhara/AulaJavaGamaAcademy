package ex6_1;

public class App_6_1 {
    public static void main(String[] args) {
        Funcionario colab1 = new Funcionario("Maria", 40, 100);
        Funcionario colab_senior = new Senior("Paula", 45, 100, 10);

        System.out.println(colab1.getSalario()); 
        System.out.println(colab_senior.getSalario()); 

        System.out.println(colab1);
        System.out.println(colab_senior);

    }
}