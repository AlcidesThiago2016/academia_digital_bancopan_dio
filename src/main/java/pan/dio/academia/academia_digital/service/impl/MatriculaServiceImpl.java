package pan.dio.academia.academia_digital.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pan.dio.academia.academia_digital.entity.Aluno;
import pan.dio.academia.academia_digital.entity.Matricula;
import pan.dio.academia.academia_digital.entity.form.MatriculaForm;
import pan.dio.academia.academia_digital.repository.AlunoRepository;
import pan.dio.academia.academia_digital.repository.MatriculaRepository;
import pan.dio.academia.academia_digital.service.IMatriculaService;

import java.util.List;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

    @Autowired
    private MatriculaRepository matriculaRepository;

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public Matricula create(MatriculaForm form) {
        Matricula matricula = new Matricula();
        Aluno aluno =  alunoRepository.findById(form.getAlunoId()).get();

        matricula.setAluno(aluno);

        return matriculaRepository.save(matricula);
    }

    @Override
    public Matricula get(Long id) {
        return matriculaRepository.findById(id).get();
    }

    @Override
    public List<Matricula> getAll(String bairro) {
        if(bairro == null){
            return matriculaRepository.findAll();
        }else{
            return matriculaRepository.findAlunosMatriculadosBairro(bairro);
        }
    }

    @Override
    public void delete(Long id) {

    }
}
