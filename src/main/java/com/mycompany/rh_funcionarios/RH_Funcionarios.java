package com.mycompany.rh_funcionarios;

import java.util.ArrayList;
import java.util.Scanner;

public class RH_Funcionarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        
        while (funcionarios.size() < 10) {
            System.out.println("Deseja adicionar um novo funcionário? (Digite 'sim' para continuar ou 'nao' para sair)");
            String resposta = scanner.nextLine().toLowerCase();
            if (!resposta.equals("sim")) {
                break;
            }

            System.out.println("Informe o tipo de funcionário (assalariado ou horista): ");
            String tipo = scanner.nextLine().toLowerCase();
            
            System.out.println("Nome: ");
            String nome = scanner.nextLine();
            System.out.println("CPF: ");
            String cpf = scanner.nextLine();
            System.out.println("Endereço: ");
            String endereco = scanner.nextLine();
            System.out.println("Telefone: ");
            String telefone = scanner.nextLine();
            System.out.println("Setor: ");
            String setor = scanner.nextLine();
            
            if (tipo.equals("assalariado")) {
                System.out.println("Salário mensal: ");
                double salario = scanner.nextDouble();
                scanner.nextLine(); 
                funcionarios.add(new Assalariado(nome, cpf, endereco, telefone, setor, salario));
            } else if (tipo.equals("horista")) {
                System.out.println("Horas trabalhadas: ");
                double horas = scanner.nextDouble();
                System.out.println("Valor por hora: ");
                double valorHora = scanner.nextDouble();
                scanner.nextLine();
                funcionarios.add(new Horista(nome, cpf, endereco, telefone, setor, horas, valorHora));
            } else {
                System.out.println("Tipo de funcionário inválido. Tente novamente.");
            }
        }
        
        System.out.println("\nLista de funcionários cadastrados:");
        for (Funcionario f : funcionarios) {
            f.mostrarDados();
            System.out.println("-------------------------");
        }
        
        System.out.println("Informe o percentual de aumento para todos os funcionários: ");
        double aumento = scanner.nextDouble();
        
        for (Funcionario f : funcionarios) {
            f.aplicarAumento(aumento);
        }
        
        System.out.println("\nLista de funcionários após aumento:");
        for (Funcionario f : funcionarios) {
            f.mostrarDados();
            System.out.println("-------------------------");
        }
        scanner.close();
    }
}
