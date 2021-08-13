package app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import app.dto.Empleado;

public interface IEmpleadoDAO extends JpaRepository<Empleado, Long> {

	public List<Empleado> findByTrabajo(String trabajo); //Listar por trabajo
	
}
