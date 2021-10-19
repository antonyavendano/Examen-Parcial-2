package carros.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import carros.dao.ICarroDAO;
import carros.model.Carro;
import carros.service.ICarroService;

@Service
public class CarroServiceImpl implements ICarroService {

	@Autowired
	private ICarroDAO dao;	
	
	@Override
	public Carro registrar(Carro t) {
		return dao.save(t);
	}

	@Override
	public Carro modificar(Carro t) {
		return dao.save(t);
	}

	@Override
	public void eliminar(int id) {
		dao.deleteById(id);		
	}

	@Override
	public Optional<Carro> listarPorId(int id) {
		return dao.findById(id);
	}

	@Override
	public List<Carro> listar() {
		return dao.findAll();
	}

}
