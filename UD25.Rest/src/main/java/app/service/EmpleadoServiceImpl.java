package app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

import app.dao.IEmpleadoDAO;
import app.dto.Empleado;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService {

	@Autowired
	IEmpleadoDAO iEmpleadoDAO;
	
	@Override
	public List<Empleado> listarEmpleados() {
		// TODO Auto-generated method stub
		return iEmpleadoDAO.findAll();
	}

	@Override
	public Empleado guardarEmpleado(Empleado empleado) {
		// TODO Auto-generated method stub
		return iEmpleadoDAO.save(empleado);
	}

	@Override
	public Empleado actualizarEmpleado(Empleado empleado) {
		// TODO Auto-generated method stub
		return iEmpleadoDAO.save(empleado);
	}

	@Override
	public void eliminarEmpleado(Long id) {
		// TODO Auto-generated method stub
		iEmpleadoDAO.deleteById(id);
	}

	@Override
	public Empleado empleadoXID(Long id) {
		// TODO Auto-generated method stub
		return iEmpleadoDAO.findById(id).get();
	}
	
	
	@Override
	public List<Empleado> listarEmpleadosTrabajo(String trabajo) {
		// TODO Auto-generated method stub
		return iEmpleadoDAO.findByTrabajo(trabajo);
	}
	
	
	
}
