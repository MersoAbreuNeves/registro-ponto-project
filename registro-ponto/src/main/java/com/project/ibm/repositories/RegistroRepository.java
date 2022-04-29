package com.project.ibm.repositories;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.project.ibm.entities.Registro;

public interface RegistroRepository extends JpaRepository<Registro, Long> {
	


//	@Query("select registro from Registro registro inner join Users user on registro.users.id = user.id "
//			+ "where registro.dataRegistro = :dataRegistro")
//	List<Registro> findByDateStartAndDateEnd(@Param("dataRegistro") LocalDateTime dataRegistro);
//	
	
}
