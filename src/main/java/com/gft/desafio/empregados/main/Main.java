package com.gft.desafio.empregados.main;

import com.gft.desafio.empregados.Gerente;
import com.gft.desafio.empregados.Supervisor;
import com.gft.desafio.empregados.Vendedor;

public class Main {
	public static void main(String[] args) {
		Gerente gr1 = new Gerente("Severino Portões", 60, 50000.d);
        Supervisor s1 = new Supervisor("Nicole Nabuco", 30, 30000.0d);
        Vendedor vv = new Vendedor("Fernando Pessoa", 50, 10000.0d);

        gr1.setNome("Maria Souza");
        gr1.setIdade(40);
        gr1.setSalario(40000.0d);

        vv.bonificacao();
        s1.bonificacao();

        System.out.println(gr1);
        System.out.println(vv);
        System.out.println(s1);
	}

}
