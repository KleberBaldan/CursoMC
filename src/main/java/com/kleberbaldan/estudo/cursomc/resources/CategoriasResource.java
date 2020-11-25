package com.kleberbaldan.estudo.cursomc.resources;

import com.kleberbaldan.estudo.cursomc.domain.Categoria;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriasResource {

    @RequestMapping(method = RequestMethod.GET)
    public List<Categoria> listar() {

        Categoria c1 = new Categoria(1, "Informática");
        Categoria c2 = new Categoria(2, "Escritório");
        List<Categoria> categorias = new ArrayList<>();
        categorias.add(c1);
        categorias.add(c2);

        return categorias;
    }
}
