package com.kleberbaldan.estudo.cursomc.services;

import com.kleberbaldan.estudo.cursomc.domain.Estado;
import com.kleberbaldan.estudo.cursomc.repositories.EstadoRepository;
import com.kleberbaldan.estudo.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EstadoService {

    @Autowired
    private EstadoRepository repo;

    public Estado Buscar(long id) {
        Optional<Estado> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id:" + id + ", Tipo: " + Estado.class.getName()
        ));
    }
}
