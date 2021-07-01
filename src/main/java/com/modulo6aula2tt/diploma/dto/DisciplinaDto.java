package com.modulo6aula2tt.diploma.dto;

public class DisciplinaDto {

    private String nome;
    private double nota;

    public DisciplinaDto(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    public String getNome() {
        return nome;
    }
}
