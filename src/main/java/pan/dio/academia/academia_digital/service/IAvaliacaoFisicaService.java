package pan.dio.academia.academia_digital.service;

import pan.dio.academia.academia_digital.entity.AvaliacaoFisica;
import pan.dio.academia.academia_digital.entity.form.AvaliacaoFisicaForm;
import pan.dio.academia.academia_digital.entity.form.AvaliacaoFisicaUpdateForm;

import java.util.List;

public interface IAvaliacaoFisicaService {

    /**
     * Cria uma avaliação fisíca e salva no banco de dados.
     * @param form - formulário referente aos dados para criação da avaliação física no BD.
     * @return - Avaliação Física recém-criada.
     */

    AvaliacaoFisica create(AvaliacaoFisicaForm form);

    /**
     * Retorna uma avaliação física que esta no bd de acordo com seu id.
     * @param id - id da avaliação física que será exibida
     * @return - Avaliação Física de acordo com o Id fornecido.
     */

    AvaliacaoFisica get(Long id);

    /**
     * Retorna todas as avaliações físicas que estão no bd.
     * @return - Uma lista com todas as avaliações física que estão salvas no bd.
     */

    List<AvaliacaoFisica> gerAll();

    /**
     * Atualiza a avaliação física.
     * @param id - id da avaliaçãa física que sera atualizada.
     * @param formUpdate - formulário referente aos dados necessários para atualização da avaliação.
     * Física no bd.
     * @return - Avaliação Física recém-atualizada.
     */

    AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate);

    /**
     * Deleta uma avaliação física específica.
     * @param id - id da avaliação física que será removida.
     */

    void delete(Long id);

}
