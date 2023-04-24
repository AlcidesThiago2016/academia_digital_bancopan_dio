package pan.dio.academia.academia_digital.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pan.dio.academia.academia_digital.entity.Aluno;
import pan.dio.academia.academia_digital.entity.AvaliacaoFisica;
import pan.dio.academia.academia_digital.entity.form.AlunoForm;
import pan.dio.academia.academia_digital.entity.form.AlunoUpdateForm;
import pan.dio.academia.academia_digital.repository.AlunoRepository;
import pan.dio.academia.academia_digital.service.IAlunoService;

import java.util.List;


@Service
public class AlunoServiceImpl implements IAlunoService {

    @Autowired
    private AlunoRepository repository;

    @Override
    public Aluno create(AlunoForm form) {
        Aluno aluno = new Aluno();
        aluno.setNome(form.getNome());
        aluno.setCpf(form.getCpf());
        aluno.setBairro(form.getBairro());
        aluno.setDataDeNascimento(form.getDataDeNascimento());

        return repository.save(aluno);

    }

    @Override
    public Aluno get(Long id) {
        return null;
    }

    @Override
    public List<Aluno> getAll() {
        return repository.findAll();
    }

    @Override
    public Aluno update(Long id, AlunoUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<AvaliacaoFisica> getAvaliacaoFisicaId(Long id) {

        Aluno aluno = repository.findById(id).get();
        return aluno.getAvaliacoes();
    }
}
