package com.modulo6aula2tt.diploma.dao;

import com.modulo6aula2tt.diploma.model.Aluno;

import java.util.stream.Collectors;

import static com.modulo6aula2tt.diploma.DiplomaApplication.bDalunos;

public class AlunoDao {



    public AlunoDao() {
    }

    public void saveAluno(Aluno a){
        a.setId(bDalunos.size());
        bDalunos.add(a);
    }


    public Aluno getAlunoById(int id){

        return bDalunos.stream().filter(a -> a.getId() == id).collect(Collectors.toList()).get(0);

    }


}
