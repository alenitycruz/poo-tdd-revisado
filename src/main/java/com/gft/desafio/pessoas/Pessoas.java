package com.gft.desafio.pessoas;

import java.util.ArrayList;
import java.util.List;


public class Pessoas {
	
	private String nome;
	
	private int idade;

	public Pessoas(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public Pessoas() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Pessoas maiorIdadeObjeto(List<Pessoas> pessoas) {

		Pessoas aux = new Pessoas("", 0);
        for (Pessoas pe: pessoas) {

            if(pe.getIdade() > aux.getIdade()){
                aux.setIdade(pe.getIdade());
                aux.setNome(pe.getNome());
            }

        }
        return aux;
	}

	 public List<Pessoas> maioresDeIdade(List<Pessoas> pessoas) {

	        List<Pessoas> aux = new ArrayList<Pessoas>();
	        for (Pessoas pe: pessoas) {
	            if (pe.getIdade() > 17) {
	                aux.add(pe);
	            }
	        }
	        return aux;
	    }

	    public Pessoas encontrarPessoa (List<Pessoas> pessoas) {
	    	Pessoas aux = new Pessoas("", 0);
	         for (Pessoas pe: pessoas) {

	            if(pe.getNome().equalsIgnoreCase("Jessica")){
	                aux.setIdade(pe.getIdade());
	                aux.setNome(pe.getNome());
	            }

	        }
	        return aux;
	     
	    }



	    @Override
	    public String toString() {
	        return "Nome: " + nome + 
	                ", Idade: " + idade;
	    }
	
}
