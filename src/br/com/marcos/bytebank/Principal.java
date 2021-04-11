package br.com.marcos.bytebank;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao Bytebank");

        funcionario funcionario = new funcionario();

        String nome;
        int matricula;
        LocalDate DatadeNascimento;

        funcionario.setNome("Carlos Almeida");
        funcionario.setMatricula(1);
        funcionario.setDatadeNascimento(LocalDate.of(1987, 02, 02));

        System.out.println(funcionario);

    }
}
