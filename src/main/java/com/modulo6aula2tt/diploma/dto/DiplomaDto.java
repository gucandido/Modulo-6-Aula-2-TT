package com.modulo6aula2tt.diploma.dto;


import com.modulo6aula2tt.diploma.dao.AlunoDisciplinaDao;
import com.modulo6aula2tt.diploma.model.Aluno;
import com.modulo6aula2tt.diploma.model.AlunoDisciplina;

import java.util.ArrayList;
import java.util.List;

public class DiplomaDto {

    private String aluno;
    private List<DisciplinaDto> disciplinas = new ArrayList<>();
    private double media = 0.0;
    private String mensagem;

    public DiplomaDto(Aluno a) {

        AlunoDisciplinaDao dao = new AlunoDisciplinaDao();

        this.aluno = a.getNome();

        List<AlunoDisciplina> alunoDisc = dao.getNotaDisciplina(a);

        alunoDisc.forEach(ad -> this.disciplinas.add(new DisciplinaDto(ad.getDisciplina().getNome(),ad.getNota())));

        this.disciplinas.forEach(x-> this.media += x.getNota());
        this.media = this.media/this.disciplinas.size();

        if(this.media < 5)
            this.mensagem = "Você não obteve o diploma...";
        else if(this.media < 9)
            this.mensagem = "Parabens, você recebeu o diploma!";
        else
            this.mensagem = "Parabens, você recebeu o diploma e foi destaque por sua nota!";

    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public List<DisciplinaDto> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<DisciplinaDto> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

}
