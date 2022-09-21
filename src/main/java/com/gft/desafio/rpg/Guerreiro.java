package com.gft.desafio.rpg;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Guerreiro extends Personagem {
	
	private List<String> habilidade = new ArrayList<>();
	
	public Guerreiro() {
		
	}

	public Guerreiro(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
		super(nome, vida, mana, xp, inteligencia, forca, level);
		
	}
	

	public List<String> getHabilidade() {
		return habilidade;
	}

	public void setHabilidade(List<String> habilidade) {
		this.habilidade = habilidade;
	}

	@Override
	public void lvlUp() {

		super.setVida(getVida()+5);
        super.setXp(getXp()+1);
        super.setForca(getForca()+5);
        super.setMana(getMana()+1);
        super.setInteligencia(getInteligencia()+1);
		
	}

	public void attack() {

        Random random = new Random();

        int aleatorio = random.nextInt(300) + 1;

        super.setForca((getForca()*getLevel()) + aleatorio);

        System.out.println("O Guerreiro esta com Forca: " + super.getForca());
	}

	public void aprenderHabilidade(String hab) {
		
        habilidade.add(hab);
		
	}

	@Override
	public String toString() {
		return "Guerreiro: "+ nome + ", vida: " + vida + ", mana: " + mana + ", xp: "
				+ xp + ", inteligencia: " + inteligencia + ", forca: " + forca + ", level: " + level + ", habilidades: " + getHabilidade();
	}

	
	
	

	
	
}
