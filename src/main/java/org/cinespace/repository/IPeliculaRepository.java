package org.cinespace.repository;

import org.cinespace.model.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPeliculaRepository extends JpaRepository<Pelicula, String>{
	//crud..

}
