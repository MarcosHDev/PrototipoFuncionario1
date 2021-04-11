package br.com.marcos.bytebank;

import java.time.LocalDate;

public class funcionario {

    private String nome;
    private int matricula;
    private LocalDate DatadeNascimento;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDatadeNascimento(LocalDate datadeNascimento) {
        DatadeNascimento = datadeNascimento;
    }

    @Override
    public String toString () {
        return "funcionario{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", DatadeNascimento=" + DatadeNascimento +
                '}';
    }

    public void setMatricula (int matricula) {
        this.matricula = matricula;
    }
}


