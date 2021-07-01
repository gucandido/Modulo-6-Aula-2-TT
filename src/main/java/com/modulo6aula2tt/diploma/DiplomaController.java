package com.modulo6aula2tt.diploma;

import com.modulo6aula2tt.diploma.dao.AlunoDao;
import com.modulo6aula2tt.diploma.dao.DisciplinaDao;
import com.modulo6aula2tt.diploma.dto.DiplomaDto;
import com.modulo6aula2tt.diploma.model.Aluno;
import com.modulo6aula2tt.diploma.model.Disciplina;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/diploma")
public class DiplomaController {

    @GetMapping("/{idAluno}")
    public ResponseEntity<DiplomaDto> getDiploma(@PathVariable int idAluno){

        AlunoDao dao = new AlunoDao();

        Aluno a = dao.getAlunoById(idAluno);

        return new ResponseEntity<DiplomaDto>(new DiplomaDto(a),HttpStatus.OK);

    }


}
