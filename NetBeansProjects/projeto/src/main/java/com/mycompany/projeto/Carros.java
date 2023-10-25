package com.mycompany.projeto;

public class Carros {
    private String nome;
    private String pergunta;

    public Carros(String nome, String pergunta) {
        this.nome = nome;
        this.pergunta = pergunta;
    }

    public String getNome() {
        return nome;
    }

    public String getPergunta() {
        return pergunta;
    }
}