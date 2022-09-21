package com.gft.teste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.gft.desafio.pessoas.Pessoas;

public class PessoasTeste {
	
	private Pessoas pessoas;
	
	private Pessoas p1;
	
	private Pessoas p2;
	
	private Pessoas p3;
	
	private Pessoas p4;
	
	private List<Pessoas> pessoasLista;

	@BeforeEach
	public void setUp() {
		
		pessoas = new Pessoas();
				
		p1 = new Pessoas("Joao", 15);
		p2 = new Pessoas("Leandro", 21);
		p3 = new Pessoas("Paulo", 17);
		p4 = new Pessoas("Jessica", 18);

		pessoasLista = new ArrayList<>();
		pessoasLista.add(p1);
		pessoasLista.add(p2);
		pessoasLista.add(p3);
		pessoasLista.add(p4);
	
		  
	}
	
	@Test
	public void testarAtributos() throws Exception{
		
		Assertions.assertAll("p1",
				() -> assertEquals("Joao", p1.getNome()),
				() -> assertEquals(15, p1.getIdade()));
		
		Assertions.assertAll("p2",
				() -> assertEquals("Leandro", p2.getNome()),
				() -> assertEquals(21, p2.getIdade()));
		
		Assertions.assertAll("p3",
				() -> assertEquals("Paulo", p3.getNome()),
				() -> assertEquals(17, p3.getIdade()));
				
		Assertions.assertAll("p4",
				() -> assertEquals("Jessica", p4.getNome()),
				() -> assertEquals(18, p4.getIdade()));
		
	}

	@Test
	public void tamanhoDoArray() throws Exception{
		
		Assertions.assertEquals(4, pessoasLista.size());
	}
	
	@Test
	public void testarMetodoMaiorIdade() throws Exception{
		Assertions.assertEquals("Leandro", pessoas.maiorIdadeObjeto(pessoasLista).getNome());
	}
	
	@Test
	public void testarMetodoMaioresDeIdade() throws Exception{
		Assertions.assertEquals("Jessica", pessoas.maioresDeIdade(pessoasLista).get(1).getNome());
	}
	
	@Test
	public void testarMetodoEncontrarPessoa() throws Exception{
		Assertions.assertEquals("Jessica", pessoas.encontrarPessoa(pessoasLista).getNome());
	}
	
	
}
