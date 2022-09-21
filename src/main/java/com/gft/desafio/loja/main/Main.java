package com.gft.desafio.loja.main;

import java.util.ArrayList;
import java.util.List;

import com.gft.desafio.loja.model.Livro;
import com.gft.desafio.loja.model.Loja;
import com.gft.desafio.loja.model.VideoGame;

public class Main {
	public static void main(String[] args) {
		Livro l1 = new Livro("Harry Potter", 40d, 50, "J. K. Rowling", "fantasia", 300);
		Livro l2 = new Livro("Senhor dos Aneis", 60d, 30, "J. R. R. Tolkien", "fantasia", 500);
		Livro l3 = new Livro("Java POO", 20d, 50, "GFT", "educativo", 500);

		VideoGame ps4 = new VideoGame("PS4", 1800d, 100, "Sony", "Slim", false);
		VideoGame ps4Usado = new VideoGame("PS4", 1000d, 7, "Sony", "Slim", true);
		VideoGame xbox = new VideoGame("XBOX", 1500d, 500, "Microsoft", "One", false);
		
		List<Livro> livro = new ArrayList<>();
		livro.add(l1);
		livro.add(l2);
		livro.add(l3);
		
		
		List<VideoGame> games = new ArrayList<>();
		games.add(ps4);
		games.add(ps4Usado);
		games.add(xbox);

		Loja americanas = new Loja("Americanas", "12345678", livro, games);

		l2.calculaImposto();
		l3.calculaImposto();

		ps4Usado.calculaImposto();
		ps4.calculaImposto();

		System.out.println("---------------------------------------");
		System.out.println("A loja Americanas possui estes livros para venda: ");
		americanas.listaLivros();
		System.out.println("---------------------------------------");
		System.out.println("A loja Americanas possui estes video-games para venda: ");
		americanas.listaVideoGames();
		System.out.println("---------------------------------------");
		americanas.calculaPatrimonio();
	}

}
