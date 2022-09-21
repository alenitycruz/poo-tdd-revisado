package com.gft.desafio.empregados;

public class Supervisor extends Funcionario{

	public Supervisor(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }

    @Override
    public void bonificacao() {
        super.salario += 5000.0d;
    }

    @Override
    public String toString() {
        return "Supervisor{" +
                "nome: " + nome +
                ", idade: " + idade +
                ", salario: " + salario +
                '}';
    }
}
