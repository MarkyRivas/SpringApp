package com.data.conecion.controler;

import com.data.conecion.repo.Husos_horariosRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class Endpoints {
    private final Husos_horariosRepo myRepository;

    @Autowired
    public Endpoints(Husos_horariosRepo myRepository) {
        this.myRepository = myRepository;
    }

    @GetMapping("/husos_horarios")
    public String getCampo() {
        // Aquí realizas la consulta a la base de datos y obtienes el campo deseado
        String campo = myRepository.findAll().toString();
        return campo;
    }

    @GetMapping("/home")
    public String getBody() {
        // Aquí realizas la consulta a la base de datos y obtienes el campo deseado
        String body = "hello body";
        return body;
    }

}
