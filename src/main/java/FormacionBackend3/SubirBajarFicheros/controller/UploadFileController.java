package FormacionBackend3.SubirBajarFicheros.controller;

import FormacionBackend3.SubirBajarFicheros.service.UploadFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;


@Controller
public class UploadFileController {


    @Autowired
    UploadFileService uploadFileService;



    @GetMapping("/")
    public String index() {
        return "uploadFileView";
    }



    @PostMapping("/upload")
    public ResponseEntity<?> uploadFile(@RequestParam("file") MultipartFile file) {

        if(file.isEmpty()) {
            return new ResponseEntity<Object>("Seleccionar un archivo", HttpStatus.OK);
        }
        try {
            uploadFileService.saveFile(file);
        }
        catch(IOException e) {
            e.printStackTrace();
        }

        return new ResponseEntity<Object>("Archivo subido correctamente", HttpStatus.OK);
    }

}
