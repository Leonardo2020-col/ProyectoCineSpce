package org.cinespace.repository;

import org.cinespace.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepository extends JpaRepository<Usuario, String>{
	//crud..
	
}
