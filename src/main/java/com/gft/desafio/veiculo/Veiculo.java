package com.gft.desafio.veiculo;

public class Veiculo {
	
	private String marca;
    private String modelo;
    private String placa;
    private String cor;
    private float km;
    private boolean isLigado;
    private int litrosCombustivel;
    private int velocidade = 0;
    private double preco;


    public Veiculo() {
    }

    public Veiculo(String marca, String modelo, String placa, String cor, float km, boolean isLigado, int litrosCombustivel, int velocidade, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
        this.km = km;
        this.isLigado = isLigado;
        this.litrosCombustivel = litrosCombustivel;
        this.velocidade = velocidade;
        this.preco = preco;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setKm(float km) {
        this.km = km;
    }

    public void setLigado(boolean ligado) {
        isLigado = ligado;
    }

    public void setLitrosCombustivel(int litrosCombustivel) {
        this.litrosCombustivel = litrosCombustivel;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getCor() {
        return cor;
    }

    public float getKm() {
        return km;
    }

    public boolean isLigado() {
        return isLigado;
    }

    public int getLitrosCombustivel() {
        return litrosCombustivel;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public double getPreco() {
        return preco;
    }

    public void acelerar(){
       if (velocidade >= 0) velocidade = velocidade + 20;
    }

    public void abastecer(int combustivel){
        litrosCombustivel = litrosCombustivel + combustivel;
        if (litrosCombustivel > 60){
            System.out.println("Limite de 60 litros excedido!");
        }

    }

    public void frear() {
        if (velocidade >= 20) velocidade = velocidade - 20;
    }

    public void pintar(String cor){
       this.setCor(cor);
    }

    public void ligar(){

        if (this.isLigado == false){

            this.setLigado(true);
        }
    }

    public void desligar() {
        if (this.isLigado == true && velocidade == 0) {
            this.setLigado(false);
        } else {
            this.setLigado(true);
        }
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "marca: " + marca + 
                ", modelo: " + modelo +
                ", placa: " + placa +
                ", cor: " + cor +
                ", km: " + km +
                ", isLigado: " + isLigado +
                ", litrosCombustivel: " + litrosCombustivel +
                ", velocidade: " + velocidade +
                ", preco: " + preco +
                '}';
    }

}
