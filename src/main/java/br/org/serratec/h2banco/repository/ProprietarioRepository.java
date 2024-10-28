package br.org.serratec.h2banco.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import br.org.serratec.h2banco.domain.Proprietario;

public interface ProprietarioRepository extends JpaRepository <Proprietario, Long> {

	
}
