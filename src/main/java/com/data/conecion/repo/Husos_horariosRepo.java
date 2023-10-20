package com.data.conecion.repo;

import com.data.conecion.enty.Husos_horarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface Husos_horariosRepo extends JpaRepository <Husos_horarios, Integer> {

 List<Husos_horarios> findAll();

}
