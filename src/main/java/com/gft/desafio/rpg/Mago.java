package com.gft.desafio.rpg;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mago extends Personagem{
	
	private List<String> magia = new ArrayList<>();
	
	public Mago() {
		
	}
	
	public Mago(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
	
		super(nome, vida, mana, xp, inteligencia, forca, level);
	}
	
	

	public List<String> getMagia() {
		return magia;
	}

	public void setMagia(List<String> magia) {
		this.magia = magia;
	}

	@Override
	public void lvlUp() {
		super.setVida(getVida()+1);
        super.setXp(getXp()+1);
        super.setForca(getForca()+1);
        super.setMana(getMana()+5);
        super.setInteligencia(getInteligencia()+5);
        super.setLevel(getLevel()+1);

		
	}

	public void attack() {
		Random random = new Random();

        int aleatorio = random.nextInt(300) + 1;

        super.setInteligencia((getInteligencia()*getLevel()) + aleatorio);

        System.out.println("O Mago esta com Inteligencia: " + super.getInteligencia());
		
	}

	public void aprenderMagia(String mag) {
		
		magia.add(mag);
		
	}

	@Override
	public String toString() {
		return "Mago: " + nome + ", vida: " + vida + ", mana: " + mana + ", xp: " + xp
				+ ", inteligencia: " + inteligencia + ", forca: " + forca + ", level: " + level + ", magias: "
				+ getMagia();
	}
	
	

}
