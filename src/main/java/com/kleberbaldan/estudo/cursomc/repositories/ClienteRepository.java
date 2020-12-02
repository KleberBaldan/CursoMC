package com.kleberbaldan.estudo.cursomc.repositories;

import com.kleberbaldan.estudo.cursomc.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
