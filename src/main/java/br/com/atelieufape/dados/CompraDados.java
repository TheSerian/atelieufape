package br.com.atelieufape.dados;

import br.com.atelieufape.negocio.basico.CompraEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CompraDados extends JpaRepository<CompraEntity, Long> {
    boolean existsById(Long id);
}
