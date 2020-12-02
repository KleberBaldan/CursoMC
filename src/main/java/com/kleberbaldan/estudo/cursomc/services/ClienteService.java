package com.kleberbaldan.estudo.cursomc.services;

import com.kleberbaldan.estudo.cursomc.domain.Cliente;
import com.kleberbaldan.estudo.cursomc.repositories.ClienteRepository;
import com.kleberbaldan.estudo.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repo;

    public Cliente buscar(long id) {
        Optional<Cliente> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id:" + id + ", Tipo: " + Cliente.class.getName()
        ));
    }
}
