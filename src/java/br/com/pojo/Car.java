package br.com.pojo;

public class Car {
    private String id, cor, marca;
    private int ano, preco;
    private boolean statusVenda;

    public Car() {}    

    public Car(String id, String marca, int ano, String cor, int preco, boolean statusVenda) {
        this.id = id;
        this.cor = cor;
        this.marca = marca;
        this.ano = ano;
        this.preco = preco;
        this.statusVenda = statusVenda;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public boolean isStatusVenda() {
        return statusVenda;
    }

    public void setStatusVenda(boolean statusVenda) {
        this.statusVenda = statusVenda;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
}
