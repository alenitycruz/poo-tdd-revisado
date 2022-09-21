package com.gft.teste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.gft.desafio.loja.model.Livro;
import com.gft.desafio.loja.model.Loja;
import com.gft.desafio.loja.model.VideoGame;

public class LojaTeste {


    private Loja loja;

    private Livro livro;

    private List<Livro> livros = new ArrayList<>();

    private VideoGame games;

    private List<VideoGame> vg = new ArrayList<>();

    @BeforeEach
    public void setup() {
        loja = new Loja("Americanas", "123456789", livros, vg);
        livro = new Livro("Java para iniciantes", 18.0d, 10, "Bill Gates", "educativo", 200);
        games = new VideoGame("PS4", 1800d, 100, "Sony", "Slim", false);
    }

    @Test
    public void testarAtributosLoja() throws Exception {
        livro.setNome("Mansfield Park");
        livro.setPreco(30.0d);
        livro.setQtd(100);
        livro.setAutor("Jane Austen");
        livro.setTema("Romance");
        livro.setQtdPag(100);

        games.setNome("PS5");
        games.setPreco(30.0d);
        games.setQtd(100);
        games.setMarca("PlayStation");
        games.setModelo("Cinco");
        games.setUsado(true);

        loja.setEstabelecimento("Americanas");
        loja.setCnpj("123456789");

    }

    @Test
    public void testarImposto() throws Exception {
        livro.calculaImposto();
        games.calculaImposto();

        assertEquals(1.0d, livro.calculaImposto(), 0.0001d);
        assertEquals(810.0d, games.calculaImposto(), 0.0001d);
    }

    @Test
    public void testarListas() throws Exception {
        loja.listaLivros();
        loja.listaVideoGames();
    }

    @Test
    public void testarPatrimonio() throws Exception {
        loja.calculaPatrimonio();
    }
}
