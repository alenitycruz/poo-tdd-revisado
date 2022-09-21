package com.gft.desafio.veiculo.main;

import com.gft.desafio.veiculo.Veiculo;

public class Main {
	public static void main(String[] args) {
		Veiculo v1 = new Veiculo();

        v1.setMarca("Jeep");
        v1.setModelo("Renegade");
        v1.setPlaca("ALE5555");
        v1.setCor("Amarelo");
        v1.setKm(10.00f);
        v1.setLigado(true);
        v1.setLitrosCombustivel(30);
        v1.setVelocidade(0);
        //v1.setVelocidade(30);
        v1.setPreco(90000.00);
        //v1.acelerar();
        v1.abastecer(30);
        v1.abastecer(30);
        v1.pintar("Dourado");
        v1.desligar();

        System.out.println(v1);
	}

}
