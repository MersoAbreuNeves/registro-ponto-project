package com.project.ibm.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.ibm.entities.Registro;
import com.project.ibm.entities.User;
import com.project.ibm.repositories.RegistroRepository;
import com.project.ibm.repositories.UserRepository;

@Controller
@RequestMapping(value = "/register")
public class RegistroController {

	@Autowired
	private RegistroRepository registroRepository;

	@Autowired
	private UserRepository userRepository;

	@PostMapping(path = "/{id}")
	public ResponseEntity<Registro> create(@RequestBody Registro register, @PathVariable("id") Long id) {

		Optional<User> users = userRepository.findById(id);
		Registro registers  = new Registro(users.get());

		this.registroRepository.save(registers);

		return ResponseEntity.ok(registers);
	}

	@GetMapping
	public ResponseEntity<List<Registro>> show() {
		List<Registro> registro =registroRepository.findAll();
		return ResponseEntity.ok(registro);
	}
	
//	@PostMapping("/filtro")
//	public ResponseEntity<List<Registro>> filterRegistos(@RequestBody RegistroUsuarioDTO registroUsuarioDto){
//		
//		List<Registro> registers = this.registroRepository.findByName(registroUsuarioDto.getNome());
//		
//		return ResponseEntity.ok(registers);
//	}

//	@PostMapping("/filtroData")
//	public ResponseEntity<List<Registro>> filterRegistosData(@RequestBody RegistroUsuarioDTO registroUsuarioDto){
//		
//		List<Registro> registers = this.registroRepository.findByDate(registroUsuarioDto.getDataRegistro());
//		
//		return ResponseEntity.ok(registers);
//	}
}
