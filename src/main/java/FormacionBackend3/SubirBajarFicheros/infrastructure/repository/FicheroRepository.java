package FormacionBackend3.SubirBajarFicheros.infrastructure.repository;

import FormacionBackend3.SubirBajarFicheros.domain.Fichero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FicheroRepository extends JpaRepository<Fichero,Integer> {
}
