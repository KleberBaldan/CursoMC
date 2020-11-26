package com.kleberbaldan.estudo.cursomc;

import com.kleberbaldan.estudo.cursomc.domain.Categoria;
import com.kleberbaldan.estudo.cursomc.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

    @Autowired
    private CategoriaRepository repo;

    public static void main(String[] args) {
        SpringApplication.run(CursomcApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Categoria cat1 = new Categoria("Informática");
        Categoria cat2 = new Categoria("Escritório");
        repo.saveAll(Arrays.asList(cat1, cat2));

    }
}
