package com.kleberbaldan.estudo.cursomc.repositories;

import com.kleberbaldan.estudo.cursomc.domain.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Long> {
}
