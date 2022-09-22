package FormacionBackend3.SubirBajarFicheros.application;

import FormacionBackend3.SubirBajarFicheros.domain.Fichero;
import FormacionBackend3.SubirBajarFicheros.infrastructure.dtos.FicheroOutputDTO;
import FormacionBackend3.SubirBajarFicheros.infrastructure.repository.FicheroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.GregorianCalendar;

@Service
public class UploadFileServiceImpl implements UploadFileService {

    @Autowired
    FicheroRepository ficheroRepository;

    private String upload_folder = ".//src//main//resources//files//";


    @Override
    public FicheroOutputDTO saveFile(MultipartFile file) throws IOException {

        GregorianCalendar calendario = new GregorianCalendar();
        //Al metodo setTime le pasamos una instancia de java.util.Date
        calendario.setTime(new java.util.Date());

        Fichero fichero= new Fichero();
        fichero.setName(file.getOriginalFilename());
        fichero.setFecha(calendario);
        fichero.setMetaDato("Programacion");

        ficheroRepository.save(fichero);


        if (!file.isEmpty()) {
            byte[] bytes = file.getBytes();
            Path path = Paths.get(upload_folder + file.getOriginalFilename());
            Files.write(path, bytes);
        }

        return new FicheroOutputDTO(fichero);
    }
}
