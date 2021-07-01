package com.modulo6aula2tt.diploma;

import com.modulo6aula2tt.diploma.dao.AlunoDao;
import com.modulo6aula2tt.diploma.dao.AlunoDisciplinaDao;
import com.modulo6aula2tt.diploma.dao.DisciplinaDao;
import com.modulo6aula2tt.diploma.model.Aluno;
import com.modulo6aula2tt.diploma.model.AlunoDisciplina;
import com.modulo6aula2tt.diploma.model.Disciplina;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class DiplomaApplication {

    public static List<Aluno> bDalunos = new ArrayList<>();
    public static List<Disciplina> bDdisciplinas = new ArrayList<>();
    public static List<AlunoDisciplina> bDalunoDisciplina = new ArrayList<>();

    public static void main(String[] args) {

        SpringApplication.run(DiplomaApplication.class, args);

        // dados iniciais (simulando um BD sendo inicializado com os dados)
        AlunoDao dao = new AlunoDao();

        Aluno a1 = new Aluno("gustavo");
        Aluno a2 = new Aluno("joao");
        Aluno a3 = new Aluno("alice");
        Aluno a4 = new Aluno("rosana");

        dao.saveAluno(a1);
        dao.saveAluno(a2);
        dao.saveAluno(a3);
        dao.saveAluno(a4);

        DisciplinaDao disc = new DisciplinaDao();

        Disciplina d1 = new Disciplina("Estrutura de dados");
        Disciplina d2 = new Disciplina("Banco de dados");
        Disciplina d3 = new Disciplina("Administracao");
        Disciplina d4 = new Disciplina("Java");

        disc.saveDisciplina(d1);
        disc.saveDisciplina(d2);
        disc.saveDisciplina(d3);
        disc.saveDisciplina(d4);

        AlunoDisciplinaDao notaDao = new AlunoDisciplinaDao();

        notaDao.saveNotaDisciplina(d1,a1,3);
        notaDao.saveNotaDisciplina(d2,a1,6);
        notaDao.saveNotaDisciplina(d3,a1,8);
        notaDao.saveNotaDisciplina(d4,a1,10);

        notaDao.saveNotaDisciplina(d1,a2,7);
        notaDao.saveNotaDisciplina(d2,a2,8);
        notaDao.saveNotaDisciplina(d3,a2,6);
        notaDao.saveNotaDisciplina(d4,a2,8);

        notaDao.saveNotaDisciplina(d1,a3,5);
        notaDao.saveNotaDisciplina(d2,a3,6);
        notaDao.saveNotaDisciplina(d3,a3,7);
        notaDao.saveNotaDisciplina(d4,a3,5);

        notaDao.saveNotaDisciplina(d1,a4,9);
        notaDao.saveNotaDisciplina(d2,a4,9);
        notaDao.saveNotaDisciplina(d3,a4,9);
        notaDao.saveNotaDisciplina(d4,a4,9);


    }

}
