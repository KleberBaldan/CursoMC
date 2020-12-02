package com.kleberbaldan.estudo.cursomc.repositories;

import com.kleberbaldan.estudo.cursomc.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long> {
}
