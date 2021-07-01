package com.modulo6aula2tt.diploma.model;


public class Aluno {

    private int Id;
    private String nome;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        return this.Id == ((Aluno) o).getId();
    }

}
