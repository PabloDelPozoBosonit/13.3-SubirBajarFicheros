package FormacionBackend3.SubirBajarFicheros.domain;

import FormacionBackend3.SubirBajarFicheros.infrastructure.dtos.FicheroInputDTO;
import lombok.Data;
import org.springframework.http.ResponseEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.GregorianCalendar;

@Data
@Entity
public class Fichero {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private GregorianCalendar fecha;
    private String metaDato;


    public void createFichero(FicheroInputDTO ficheroInputDTO) {
        this.fecha = ficheroInputDTO.getFecha();
        this.metaDato = ficheroInputDTO.getMetaDato();
        this.name = ficheroInputDTO.getName();

    }


}
