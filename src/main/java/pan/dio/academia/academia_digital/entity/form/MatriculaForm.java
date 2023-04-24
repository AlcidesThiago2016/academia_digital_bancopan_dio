package pan.dio.academia.academia_digital.entity.form;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MatriculaForm {

    @NotNull(message = "Preencha o campo correntamente.")
    @Positive(message = "O Id do aluno precisa ser positivo.")
    private Long alunoId;
}
