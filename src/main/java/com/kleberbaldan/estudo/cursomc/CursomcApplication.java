package com.kleberbaldan.estudo.cursomc;

import com.kleberbaldan.estudo.cursomc.domain.Categoria;
import com.kleberbaldan.estudo.cursomc.domain.Cidade;
import com.kleberbaldan.estudo.cursomc.domain.Estado;
import com.kleberbaldan.estudo.cursomc.domain.Produto;
import com.kleberbaldan.estudo.cursomc.repositories.CategoriaRepository;
import com.kleberbaldan.estudo.cursomc.repositories.CidadeRepository;
import com.kleberbaldan.estudo.cursomc.repositories.EstadoRepository;
import com.kleberbaldan.estudo.cursomc.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

    @Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    private ProdutoRepository produtoRepository;
    @Autowired
    private EstadoRepository estadoRepository;
    @Autowired
    private CidadeRepository cidadeRepository;

    public static void main(String[] args) {
        SpringApplication.run(CursomcApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Categoria cat1 = new Categoria("Informática");
        Categoria cat2 = new Categoria("Escritório");

        Produto p1 = new Produto("Computador", 2000.00);
        Produto p2 = new Produto("Impressora", 800.00);
        Produto p3 = new Produto("Mouse", 80.00);

        Estado est1 = new Estado("Minas Gerais");
        Estado est2 = new Estado("São Paulo");

        Cidade cid1 = new Cidade("Uberlândia", est1);
        Cidade cid2 = new Cidade("São Paulo", est2);
        Cidade cid3 = new Cidade("Campinas", est2);

        cat1.getProdutos().addAll(Arrays.asList(p1, p2, p3));
        cat2.getProdutos().addAll((Arrays.asList(p2)));

        p1.getCategorias().addAll(Arrays.asList(cat1));
        p2.getCategorias().addAll(Arrays.asList(cat1, cat2));
        p3.getCategorias().addAll(Arrays.asList(cat1));

        est1.getCidades().addAll(Arrays.asList(cid1));
        est2.getCidades().addAll(Arrays.asList(cid2, cid3));

        categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
        produtoRepository.saveAll(Arrays.asList(p1, p2, p3));
        estadoRepository.saveAll(Arrays.asList(est1, est2));
        cidadeRepository.saveAll(Arrays.asList(cid1, cid2, cid3));

    }
}
