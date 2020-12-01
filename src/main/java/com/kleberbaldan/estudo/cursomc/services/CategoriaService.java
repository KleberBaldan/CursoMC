package com.kleberbaldan.estudo.cursomc.services;

import com.kleberbaldan.estudo.cursomc.domain.Categoria;
import com.kleberbaldan.estudo.cursomc.repositories.CategoriaRepository;
import com.kleberbaldan.estudo.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    public Categoria buscar(long id) {
        Optional<Categoria> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id:" + id + ", Tipo: " + Categoria.class.getName()
        ));
     }
}
