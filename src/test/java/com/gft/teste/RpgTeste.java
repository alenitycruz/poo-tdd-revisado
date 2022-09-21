package com.gft.teste;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.gft.desafio.rpg.Guerreiro;
import com.gft.desafio.rpg.Mago;

public class RpgTeste {
	
	
	private Guerreiro guerreiro;
	
	private Mago mago;
	
	@BeforeEach
	private void setup() {
		guerreiro = new Guerreiro("Jose", 0, 0, 0.0f, 0, 0, 0);
		mago = new Mago("Paracelso", 0, 0, 0.0f, 0, 0, 0);
		
		
	}
	
	@Test
	public void criarMetodoParaSubirNivelDosAtributos() throws Exception {
		
		mago.lvlUp();
		guerreiro.lvlUp();
				
	}
	
	@Test
	public void subirNivelDosAtributos() throws Exception {
		
		mago.lvlUp();
		
		List<Integer> magoEsperado = Arrays.asList(1, 5, 5, 1, 1);
		List<Integer> statusMago = Arrays.asList(mago.getVida(), mago.getMana(), mago.getInteligencia(), mago.getForca(), mago.getLevel());
		
		assertEquals(statusMago, magoEsperado);
		
		Mago m1 = new Mago();
		m1.lvlUp();
		
		Guerreiro g1 = new Guerreiro();
		g1.lvlUp();
		
		assertEquals(1.0f, m1.getXp());
		assertEquals(5, m1.getMana());

		assertEquals(5, g1.getForca());
	}
	
	@Test
	public void criarMetodoDeAtaque() throws Exception {
		
		mago.attack();
		guerreiro.attack();
	}
	
	@Test
	public void criarMetodoParaAdicionarHabilidade() throws Exception {
		List<String> habilidade = Arrays.asList("Karate");
		guerreiro.aprenderHabilidade("Karate");
		assertThat(habilidade, is(guerreiro.getHabilidade()));

	}
	
	@Test
	public void criarMetodoParaAdicionarMagia() throws Exception {
		List<String> magia = Arrays.asList("Abracadabra");
		mago.aprenderMagia("Abracadabra");
		assertThat(magia, is(mago.getMagia()));
		
	}

}
