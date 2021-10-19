package carros.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import carros.model.Carro;
import carros.service.ICarroService;

@RestController
@RequestMapping("/ver_carro")
public class VerCarrosController {
	@Autowired
	private ICarroService service;
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE) public
	 ResponseEntity<List<Carro>> listar(){ 
		return new ResponseEntity<List<Carro>>(service.listar(), HttpStatus.OK); 
	 }
}
