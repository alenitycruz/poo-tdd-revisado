package com.gft.teste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.gft.desafio.empregados.Gerente;
import com.gft.desafio.empregados.Supervisor;
import com.gft.desafio.empregados.Vendedor;

public class EmpregadosTeste {
	
	 private Gerente gerente;

	    private Supervisor supervisor;

	    private Vendedor vendedor;

	    @BeforeEach
	    public void setup(){
	        gerente = new Gerente("Severino Portões", 60, 50000.d);
	        supervisor = new Supervisor("Cristovão Colombo", 40, 6000.0d);
	        vendedor = new Vendedor("Mario Bros", 30, 2000.0d);
	    }

	    @Test
	    public void criarAtributosNasClassesFilhas() throws Exception {
	        gerente.getNome();
	        gerente.getIdade();
	        gerente.getSalario();

	        supervisor.getNome();
	        supervisor.getIdade();
	        supervisor.getSalario();

	        vendedor.getNome();
	        vendedor.getIdade();
	        vendedor.getSalario();
	    }

	    @Test
	    public void testarMetodoAbstradoBonificacao() throws Exception {
	        gerente.setSalario(1000.0d);
	        supervisor.setSalario(1000.0d);
	        vendedor.setSalario(1000.0d);

	        gerente.bonificacao();
	        supervisor.bonificacao();
	        vendedor.bonificacao();

	        assertEquals(11000.0d, gerente.getSalario(), 0.0001d);
	        assertEquals(6000.0d, supervisor.getSalario(), 0.0001d);
	        assertEquals(4000.0d, vendedor.getSalario(), 0.0001d);
	    }

	    @Test
	    public void testarContrutoresdasClassesFilhas() throws Exception{
	        gerente.setSalario(20000.0d);
	        gerente.bonificacao();

	        supervisor.bonificacao();
	        vendedor.bonificacao();

	        assertEquals(30000.0, gerente.getSalario());
	        assertEquals(11000.0, supervisor.getSalario());
	        assertEquals(5000.0, vendedor.getSalario());
	    }
}
