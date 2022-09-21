package com.gft.desafio.loja.model;

import com.gft.desafio.loja.interfaces.Imposto;

public class VideoGame extends Produto implements Imposto {
	
	
	private String marca;
    private String modelo;
    private boolean isUsado;


    public VideoGame() {
    }

    public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
		super(nome, preco, qtd);
		this.marca = marca;
		this.modelo = modelo;
		this.isUsado = isUsado;
	}



	public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isUsado() {
        return isUsado;
    }

    public void setUsado(boolean usado) {
        isUsado = usado;
    }

    @Override
    public double calculaImposto() {
        double imposto;
        if (isUsado == true) {
            imposto = preco * 0.25d;
            System.out.println("Imposto " + getNome() + " usado, " + imposto);
        }
        else {
            imposto = preco * 0.45d;
            System.out.println("Imposto " + getNome() + ", " + imposto);
        }
        return imposto;

    }

    @Override
    public String toString() {
        return "Video-game: " + nome +     
                ", preco: " + preco +
                ", quantidade: " + qtd +
                " em estoque";
    }


}
