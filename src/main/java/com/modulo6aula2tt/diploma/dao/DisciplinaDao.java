package com.modulo6aula2tt.diploma.dao;

import com.modulo6aula2tt.diploma.model.Disciplina;

import java.util.stream.Collectors;

import static com.modulo6aula2tt.diploma.DiplomaApplication.bDdisciplinas;


public class DisciplinaDao {

    public DisciplinaDao() {
    }

    public void saveDisciplina(Disciplina d){

        d.setId(bDdisciplinas.size());
        bDdisciplinas.add(d);

    }

    public Disciplina getDisciplinaById(int id){

        return bDdisciplinas.stream().filter(a -> a.getId() == id).collect(Collectors.toList()).get(0);

    }


}
