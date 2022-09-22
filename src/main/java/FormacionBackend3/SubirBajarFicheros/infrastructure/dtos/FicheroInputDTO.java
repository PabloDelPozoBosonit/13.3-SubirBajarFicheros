package FormacionBackend3.SubirBajarFicheros.infrastructure.dtos;

import lombok.Data;
import org.springframework.http.ResponseEntity;

import java.util.GregorianCalendar;

@Data
public class FicheroInputDTO {

    private Integer id;

    private GregorianCalendar fecha;
    private String metaDato;
    String name;

}
