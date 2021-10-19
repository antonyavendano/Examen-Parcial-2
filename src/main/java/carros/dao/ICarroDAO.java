package carros.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import carros.model.Carro;

public interface ICarroDAO extends JpaRepository<Carro , Integer> {

}
