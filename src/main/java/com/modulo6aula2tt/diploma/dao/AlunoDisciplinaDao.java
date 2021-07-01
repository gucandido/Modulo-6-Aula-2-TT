package com.modulo6aula2tt.diploma.dao;

import com.modulo6aula2tt.diploma.model.Aluno;
import com.modulo6aula2tt.diploma.model.AlunoDisciplina;
import com.modulo6aula2tt.diploma.model.Disciplina;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.modulo6aula2tt.diploma.DiplomaApplication.bDalunoDisciplina;

public class AlunoDisciplinaDao {

    public AlunoDisciplinaDao() {
    }

    public void saveNotaDisciplina(Disciplina d, Aluno a, double nota){

        AlunoDisciplina dNota = new AlunoDisciplina(a,d,nota);

        bDalunoDisciplina.add(dNota);

    }

    public List<AlunoDisciplina> getNotaDisciplina(Aluno a){

        return bDalunoDisciplina.stream().filter(x -> x.getAluno().equals(a)).collect(Collectors.toList());

    }

}
