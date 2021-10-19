package carros;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import carros.dao.IUsuarioDAO;
import carros.model.Usuario;

@SpringBootTest
class CarrosApplicationTests {

	@Autowired
	private IUsuarioDAO dao;
	
	@Autowired
	private BCryptPasswordEncoder bcrypt;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void crearUsuario() {
	
		Usuario us = new Usuario();
		us.setIdUsuario(2);
		us.setUsername("usuarioprueba");
		us.setPassword(bcrypt.encode("prueba"));
		us.setEnabled(true);
		
		Usuario retorno = dao.save(us);		
		
		assertTrue(retorno.getPassword().equalsIgnoreCase(us.getPassword()));
	}
}
