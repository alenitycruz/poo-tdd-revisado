package com.gft.desafio.rpg;

public abstract class Personagem {
	
	protected String nome;
	
	protected int vida = 0;
	
	protected int mana = 0;
	
	protected float xp = 0.0f;
	
	protected int inteligencia = 0;
	
	protected int forca = 0;
	
	protected int level = 0;
	
    public static int inst;

	
	public Personagem() {

	}
	
	
	public Personagem(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
		
		this.nome = nome;
		this.vida = vida;
		this.mana = mana;
		this.xp = xp;
		this.inteligencia = inteligencia;
		this.forca = forca;
		this.level = level;
		inst++;
	}



	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getVida() {
		return vida;
	}


	public void setVida(int vida) {
		this.vida = vida;
	}


	public int getMana() {
		return mana;
	}


	public void setMana(int mana) {
		this.mana = mana;
	}


	public float getXp() {
		return xp;
	}


	public void setXp(float xp) {
		this.xp = xp;
	}


	public int getInteligencia() {
		return inteligencia;
	}


	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}


	public int getForca() {
		return forca;
	}


	public void setForca(int forca) {
		this.forca = forca;
	}


	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}


	public abstract void lvlUp();

}
