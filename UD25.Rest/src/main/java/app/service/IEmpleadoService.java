package app.service;

import java.util.List;

import app.dto.Empleado;

public interface IEmpleadoService {

	public List<Empleado> listarEmpleados(); //Listar All 
	
	public Empleado guardarEmpleado(Empleado empleado);	//Guarda un empleado CREATE
	
	public Empleado actualizarEmpleado(Empleado empleado); //Actualiza datos del empleado UPDATE
	
	public void eliminarEmpleado(Long id);// Elimina el empleado DELETE
	
	public List<Empleado> listarEmpleadosTrabajo(String trabajo); //Listar por trabajo
	
	public Empleado empleadoXID(Long id); //Leer datos de un cliente READ
	
}
