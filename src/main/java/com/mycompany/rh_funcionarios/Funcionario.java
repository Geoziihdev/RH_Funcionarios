package com.mycompany.rh_funcionarios;

public abstract class Funcionario {
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private String setor;

    public Funcionario(String nome, String cpf, String endereco, String telefone, String setor) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.setor = setor;
    }

    // Métodos getters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    // Método abstrato para ser implementado pelas subclasses
    public abstract double calcularPagamento();

    public abstract void mostrarDados();

    public abstract void aplicarAumento(double aumento);
}
