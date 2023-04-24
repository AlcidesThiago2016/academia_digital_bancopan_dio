package pan.dio.academia.academia_digital.service;

import pan.dio.academia.academia_digital.entity.Matricula;
import pan.dio.academia.academia_digital.entity.form.MatriculaForm;

import java.util.List;

public interface IMatriculaService {
    /**
     * Cria uma Matricula e salva no banco de dados.
     * @param form - formulário referente aos dados para criação da Matricula no banco de dados.
     * @return - Matricula crianda recetemente.
     */
    Matricula create(MatriculaForm form);

    /**
     * Retorna uma Matricula que esta no banco de dados de acordo com sua id.
     * @param id - id da matricula que sera exibida.
     * @return - matricula de acordo com o Id fornecido.
     */

    Matricula get(Long id);


    List<Matricula> getAll(String bairro);

    /**
     * Deleta uma matricula especifica.
     * @param id - recebe a matricula da id que será removida.
     */

    void delete(Long id);
}
