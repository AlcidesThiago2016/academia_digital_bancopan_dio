package pan.dio.academia.academia_digital.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pan.dio.academia.academia_digital.entity.Aluno;
import pan.dio.academia.academia_digital.entity.AvaliacaoFisica;
import pan.dio.academia.academia_digital.entity.form.AvaliacaoFisicaForm;
import pan.dio.academia.academia_digital.entity.form.AvaliacaoFisicaUpdateForm;
import pan.dio.academia.academia_digital.repository.AlunoRepository;
import pan.dio.academia.academia_digital.repository.AvaliacaoRepository;
import pan.dio.academia.academia_digital.service.IAvaliacaoFisicaService;

import java.util.List;

@Service
public class AvaliacaoFisicaServiceImpl implements IAvaliacaoFisicaService {

    @Autowired
    private AvaliacaoRepository avaliacaoFisicaRepository;

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public AvaliacaoFisica create(AvaliacaoFisicaForm form) {
        AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
        Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();

        avaliacaoFisica.setAluno(aluno);
        avaliacaoFisica.setPeso(form.getPeso());
        avaliacaoFisica.setAltura(form.getAltura());

        return avaliacaoFisicaRepository.save(avaliacaoFisica);

    }

    @Override
    public AvaliacaoFisica get(Long id) {
        return null;
    }

    @Override
    public List<AvaliacaoFisica> gerAll() {
        return null;
    }

    @Override
    public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
