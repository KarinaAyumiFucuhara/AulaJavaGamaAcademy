package exemplo3;

public class App_3 {
    public static void main(String[] args) {
        
        GerenciaFunc funcionarios = new GerenciaFunc();

        funcionarios.addFuncionario("Maria", 40, 100);
        funcionarios.addSenior("Paula", 45, 100, 10);
        

        System.out.println(funcionarios.removerFuncionario("Maria Paula"));
        System.out.println(funcionarios.listarTodos());
        System.out.println("-----------------");

        //Funcionario colab1 = new Funcionario("Maria", 40, 100);
        //Funcionario colab_senior = new Senior("Paula", 45, 100, 10);

        //System.out.println(colab1.getSalario()); 
        //System.out.println(colab_senior.getSalario()); 

        //System.out.println(colab1);
        //System.out.println(colab_senior);

    }
}