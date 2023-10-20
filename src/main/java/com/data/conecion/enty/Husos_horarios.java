package com.data.conecion.enty;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Husos_horarios {

    @Id
    private Integer id;

    private String DESCRIPCION;

    private Integer HORA_DIFERENCIA;


}
