package com.gft.desafio.empregados;

public class Gerente extends Funcionario{
	
	public Gerente(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }

    @Override
    public void bonificacao() {
        super.salario += 10000.0d;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome: " + nome +
                ", idade: " + idade +
                ", salario: " + salario +
                '}';
    }

}
