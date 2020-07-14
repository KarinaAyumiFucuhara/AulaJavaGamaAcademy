package exemplo3;

import java.util.ArrayList;

public class GerenciaFunc {
    private ArrayList<Funcionario> funcionarios;

    public GerenciaFunc() {
        funcionarios = new ArrayList<>();
    }

    public void addFuncionario(String nome, int horas, double valor_pago) {
        Funcionario func = new Funcionario(nome, horas, valor_pago);
        funcionarios.add(func);
    }

    public void addSenior(String nome, int horas, double valor_pago, int bonus) {
        Senior senior = new Senior(nome, horas, valor_pago, bonus);
        funcionarios.add(senior);
    }

    public boolean removerFuncionario(String nome) {
        for (Funcionario funcionario : funcionarios) {
            if(funcionario.getNome().equals(nome)) {
                funcionarios.remove(funcionario);
                return true;
            }
        }
        return false;
    }

    public String listarTodos() {
        String saida = "";

        for (Funcionario funcionario : funcionarios) {
            saida += funcionario.toString() + "\n";
        }

        return saida;
    }

    public String listarTodosSenior() {
        String saida = "";
        for (Funcionario funcionario : funcionarios) {
            if (funcionario instanceof Senior) {
                saida += funcionario.toString() + "\n";
            }
            
        }

        return saida;
    }





}