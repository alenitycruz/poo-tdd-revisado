package com.gft.desafio.empregados;

public class Vendedor extends Funcionario{
	
	public Vendedor(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }

    @Override
    public void bonificacao() {
        super.salario += 3000.0d;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nome: " + nome + 
                ", idade: " + idade +
                ", salario: " + salario +
                '}';
    }

}
