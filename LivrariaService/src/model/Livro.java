package model;

import java.io.Serializable;

public class Livro  implements Serializable {
    
    private int id;
    private String titulo;
    private String autor;
    private int ano;
    private double preco;
    private int quantidade;
    private int idEditora;

    public Livro() {
    }

    public Livro(int id, String titulo, String autor, int ano, double preco, int quantidade, int idEditora) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.preco = preco;
        this.quantidade = quantidade;
        this.idEditora = idEditora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getIdEditora() {
        return idEditora;
    }

    public void setIdEditora(int idEditora) {
        this.idEditora = idEditora;
    }

    @Override
    public String toString() {
        return this.titulo;
    }
    
}
