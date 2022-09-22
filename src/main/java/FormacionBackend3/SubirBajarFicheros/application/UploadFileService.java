package FormacionBackend3.SubirBajarFicheros.application;

import FormacionBackend3.SubirBajarFicheros.infrastructure.dtos.FicheroOutputDTO;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface UploadFileService {

    public FicheroOutputDTO saveFile(MultipartFile file) throws IOException;
}
