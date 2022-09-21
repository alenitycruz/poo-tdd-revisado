package com.gft.desafio.rpg.main;

import com.gft.desafio.rpg.Guerreiro;
import com.gft.desafio.rpg.Mago;
import com.gft.desafio.rpg.Personagem;

public class Main {
	
	public static void main(String[] args) {
		 	Guerreiro g1 = new Guerreiro("Fernando", 1,1,2.5f, 1, 1, 1);

	        Mago m1 = new Mago("Roberto", 1, 1, 1.5f, 1, 1, 1);



	        m1.lvlUp();
	        m1.attack();
	        m1.aprenderMagia("Abracadabra");
	        m1.aprenderMagia("Xa ca bum");
	        m1.aprenderMagia("Uingardio e leviosa");


	        g1.lvlUp();
	        g1.attack();
	        g1.aprenderHabilidade("Karate");


	        System.out.println(m1);
	        System.out.println(g1);


	        System.out.println(m1.getMagia());
	        System.out.println(g1.getHabilidade());
	        System.out.println("Quantidade de Personagens: " + Personagem.inst);
	}

}
