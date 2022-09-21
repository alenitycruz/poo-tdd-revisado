package com.gft.desafio.loja.model;

import com.gft.desafio.loja.interfaces.Imposto;

public class Livro extends Produto implements Imposto {
	
	private String autor;
    private String tema;
    private int qtdPag;

    public Livro() {
    }
    
	public Livro(String nome, double preco, int qtd, String autor, String tema, int qtdPag) {
		super(nome, preco, qtd);
		this.autor = autor;
		this.tema = tema;
		this.qtdPag = qtdPag;
	}



	public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getQtdPag() {
        return qtdPag;
    }

    public void setQtdPag(int qtdPag) {
        this.qtdPag = qtdPag;
    }

    @Override
    public double calculaImposto() {
        double imposto;
        if (tema != "educativo") {
           imposto = preco * 0.1d;
            System.out.println("R$ " + imposto + " de imposto sobre o livro " + getNome());
        }
        else {
            imposto = 1;
            System.out.println("Livro educativo nao possui imposto: " + getNome());
        }
        return imposto;
    }

    @Override
    public String toString() {
        return "Titulo: " + nome +
                ", preco: " + preco +
                ", quantidade: " + qtd +
                " em estoque";
    }
}
