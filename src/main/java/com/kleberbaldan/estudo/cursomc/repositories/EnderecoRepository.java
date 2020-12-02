package com.kleberbaldan.estudo.cursomc.repositories;

import com.kleberbaldan.estudo.cursomc.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
