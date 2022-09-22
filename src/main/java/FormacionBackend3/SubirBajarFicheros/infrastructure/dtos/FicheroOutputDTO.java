package FormacionBackend3.SubirBajarFicheros.infrastructure.dtos;

import FormacionBackend3.SubirBajarFicheros.domain.Fichero;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.ResponseEntity;

import java.util.GregorianCalendar;

@Getter
@Setter
public class FicheroOutputDTO {

    private Integer id;
    private GregorianCalendar fecha;
    private String metaDato;
    private String name;


    public FicheroOutputDTO(Fichero fichero) {
        this.id = fichero.getId();
        this.fecha = fichero.getFecha();
        this.metaDato = fichero.getMetaDato();
        this.name = fichero.getName();

    }
}
