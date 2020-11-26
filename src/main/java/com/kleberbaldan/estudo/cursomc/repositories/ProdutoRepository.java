package com.kleberbaldan.estudo.cursomc.repositories;

import com.kleberbaldan.estudo.cursomc.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
