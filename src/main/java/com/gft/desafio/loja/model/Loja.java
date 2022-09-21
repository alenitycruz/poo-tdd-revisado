package com.gft.desafio.loja.model;

import java.util.ArrayList;
import java.util.List;

public class Loja {
	
	private String estabelecimento;
    private String cnpj;
    private List<Livro> livros = new ArrayList<>();
    private List<VideoGame> vg = new ArrayList<>();

    public Loja() {
    }
    
    public Loja(String estabelecimento, String cnpj, List<Livro> livros, List<VideoGame> vg) {
		super();
		this.estabelecimento = estabelecimento;
		this.cnpj = cnpj;
		this.livros = livros;
		this.vg = vg;
	}


	public String getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(String estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public List<VideoGame> getVg() {
        return vg;
    }

    public void setVg(List<VideoGame> vg) {
        this.vg = vg;
    }

    public void listaLivros() {
        if (livros == null){
            System.out.print("A loja nao tem livros no seu estoque.");
        } else {
        	for(Livro lv : livros) {
        		
        		System.out.println(lv);
        	}
        }
    }

    public void listaVideoGames() {
        if (vg == null) {
            System.out.print("A loja nao tem games no seu estoque.");
        } else {
        	for(VideoGame game : vg) {
        		
        		System.out.println(game);
        	}
        }
    }

    public double calculaPatrimonio() {
        double totalPatrimonio = 0;
        if(this.livros.isEmpty() != true) {
            for (Livro li : livros) {
                totalPatrimonio += li.getPreco() * li.getQtd();
            }
        }
        if (this.vg.isEmpty() != true) {
            for (VideoGame vg: vg) {
                totalPatrimonio += vg.getPreco() * vg.getQtd();
            }
        }

        System.out.println("O patrimonio da loja: " + this.getEstabelecimento() + " e de R$ " + totalPatrimonio);
        return totalPatrimonio;
    }

}
