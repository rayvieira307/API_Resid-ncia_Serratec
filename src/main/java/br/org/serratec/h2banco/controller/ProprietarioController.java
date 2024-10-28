package br.org.serratec.h2banco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.org.serratec.h2banco.domain.Proprietario;
import br.org.serratec.h2banco.repository.ProprietarioRepository;

@RestController
@RequestMapping("/proprietarios")
public class ProprietarioController {

	@Autowired
	private ProprietarioRepository proprietarioRepository;
	
	//listar
	@GetMapping
	public ResponseEntity<List<Proprietario>> listar() {
		return ResponseEntity.ok(proprietarioRepository.findAll());
	}
	
	//inserir 
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Proprietario inserir(@RequestBody Proprietario proprietario) {
		return proprietarioRepository.save(proprietario);
	}
	
	//inserir varios
	@PostMapping("/lista")
	@ResponseStatus(HttpStatus.CREATED)
	public List<Proprietario> inserirVarios(@RequestBody List<Proprietario> proprietarios) {
		return proprietarioRepository.saveAll(proprietarios);
	}
	
}