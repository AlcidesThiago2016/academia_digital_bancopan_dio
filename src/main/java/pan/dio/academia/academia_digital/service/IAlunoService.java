package pan.dio.academia.academia_digital.service;

import pan.dio.academia.academia_digital.entity.Aluno;
import pan.dio.academia.academia_digital.entity.AvaliacaoFisica;
import pan.dio.academia.academia_digital.entity.form.AlunoForm;
import pan.dio.academia.academia_digital.entity.form.AlunoUpdateForm;

import java.util.List;

public interface IAlunoService {
    /**
     * Cria um Aluno e salva no bd.
     * @param form - formulario referente aos dados para criação de um Aluno no bd.
     * @return - Aluno recém-criado.
     */

    Aluno create(AlunoForm form);

    /**
     * Retorna um Aluno que está no bd de acordo com seu Id.
     * @param id - id do Aluno que será exibido.
     * @return - Aluno de acordo com o Id fornecido.
     */

    Aluno get(Long id);

    /**
     * Retorna todos os alunos que estão no bd.
     * @return - Uma lista dos alunos que estão salvas no DB.
     */

    List<Aluno> getAll();

    /**
     * Atualiza o aluno.
     * @param id - id do aluno que sera atualizado.
     * @param formUpdate - formulario referente aos dados necessários para atualização do Aluno no bd.
     * @return - Aluno recém-atualizado.
     */

    Aluno update(Long id, AlunoUpdateForm formUpdate);

    /**
     * Deleta um aluno especifíco.
     * @param id - id do aluno que sera removido.
     */

    void delete(Long id);

    List<AvaliacaoFisica> getAvaliacaoFisicaId(Long id);
}
