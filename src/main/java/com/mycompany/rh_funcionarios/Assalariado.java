package com.mycompany.rh_funcionarios;

public class Assalariado extends Funcionario {
    private double salario;

    public Assalariado(String nome, String cpf, String endereco, String telefone, String setor, double salario) {
        super(nome, cpf, endereco, telefone, setor);
        this.salario = salario;
    }

    @Override
    public double calcularPagamento() {
        return salario;
    }

    @Override
    public void mostrarDados() {
        System.out.println("Assalariado - Nome: " + getNome() + ", CPF: " + getCpf() + ", Salário: " + calcularPagamento());
    }

    @Override
    public void aplicarAumento(double aumento) {
        this.salario += salario * aumento / 100;
    }
}
