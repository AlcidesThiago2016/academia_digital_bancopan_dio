package pan.dio.academia.academia_digital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pan.dio.academia.academia_digital.entity.AvaliacaoFisica;

@Repository
public interface AvaliacaoRepository extends JpaRepository<AvaliacaoFisica, Long> {
}
