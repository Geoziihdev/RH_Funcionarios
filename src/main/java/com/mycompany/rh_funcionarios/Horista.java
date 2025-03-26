package com.mycompany.rh_funcionarios;

public class Horista extends Funcionario {
    private double horasTrabalhadas;
    private double valorPorHora;

    public Horista(String nome, String cpf, String endereco, String telefone, String setor, double horasTrabalhadas, double valorPorHora) {
        super(nome, cpf, endereco, telefone, setor);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    @Override
    public double calcularPagamento() {
        return horasTrabalhadas * valorPorHora;
    }

    @Override
    public void mostrarDados() {
        System.out.println("Horista - Nome: " + getNome() + ", CPF: " + getCpf() + ", Salário: " + calcularPagamento());
    }

    @Override
    public void aplicarAumento(double aumento) {
        this.valorPorHora += valorPorHora * aumento / 100;
    }
}
