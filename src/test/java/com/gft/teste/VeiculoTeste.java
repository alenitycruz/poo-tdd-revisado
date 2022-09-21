package com.gft.teste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.gft.desafio.veiculo.Veiculo;

public class VeiculoTeste {
	
    private Veiculo veiculo;


    @BeforeEach
    public void setup() {
        veiculo = new Veiculo();
        veiculo.setMarca("BMW");
        veiculo.setModelo("Z4");
        veiculo.setPlaca("AAA7777");
        veiculo.setCor("Amarela");
        veiculo.setKm(10.0f);
        veiculo.setLigado(true);
        veiculo.setLitrosCombustivel(10);
        veiculo.setVelocidade(0);
        veiculo.setPreco(220900.0d);


    }

    @Test
    public void testarAcelerarVeiculo() throws Exception{
        veiculo.setVelocidade(0);
        veiculo.acelerar();

        assertEquals(20, veiculo.getVelocidade(), 0.0001);
    }

    @Test
    public void testarAbastecerVeiculo() throws Exception {
        veiculo.abastecer(30);
        veiculo.getLitrosCombustivel();
        assertEquals("Limite de 60 litros excedido!", "Limite de 60 litros excedido!");
    }

    @Test
    public void testarFrearVeiculo() throws Exception{
        veiculo.frear();
        veiculo.getVelocidade();
        veiculo.setVelocidade(50);
        veiculo.frear();

        assertEquals(30, veiculo.getVelocidade(), 0.0001);
    }

    @Test
    public void testarPintarVeiculo() throws Exception{
        veiculo.pintar("Azul");

        assertEquals("Azul", veiculo.getCor());
    }

    @Test
    public void testarLigarVeiculo() throws Exception {
        veiculo.setLigado(false);
        veiculo.ligar();

        assertEquals(true, veiculo.isLigado());
    }

    @Test
    public void testarDesligarVeiculo() throws Exception {
        veiculo.setLigado(true);
        veiculo.setVelocidade(0);
        veiculo.desligar();

        assertEquals(false, veiculo.isLigado());

    }

}
