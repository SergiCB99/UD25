package app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import app.service.EmpleadoServiceImpl;
import app.dto.*;

@RestController
@RequestMapping("/api")
public class Controller {

	@Autowired
	EmpleadoServiceImpl empleadoServiceImpl;
	
	//Listar todos
	@GetMapping("/empleados")
	public List<Empleado> listarEmpleados(){
		return empleadoServiceImpl.listarEmpleados();
	}
	
	//Insertar empleado
	@PostMapping("/empleados")
	public Empleado salvarEmpleados(@RequestBody Empleado empleado) {
		
		return empleadoServiceImpl.guardarEmpleado(empleado);
	}
	
	//Actualizar Empleado
	@PutMapping("/empleados/{id}")
	public Empleado actualizarEmpleado(@PathVariable(name="id")Long id,@RequestBody Empleado empleado) {
		
		Empleado empleado_seleccionado= new Empleado();
		Empleado empleado_actualizado= new Empleado();
		
		empleado_seleccionado= empleadoServiceImpl.empleadoXID(id);
		
		empleado_seleccionado.setNombre(empleado.getNombre());
		empleado_seleccionado.setTrabajo(empleado.getTrabajo());
		empleado_seleccionado.setSalario(empleado.getSalario());
		
		
		empleado_actualizado = empleadoServiceImpl.actualizarEmpleado(empleado_seleccionado);
		
		System.out.println("El empleado actualizado es: "+ empleado_actualizado);
		
		return empleado_actualizado;
	}
	
	//Eliminar Empleado
	@DeleteMapping("/empleados/{id}")
	public void eliminarEmpleado(@PathVariable(name="id")Long id) {
		empleadoServiceImpl.eliminarEmpleado(id);
	}
	
	
	//Listar por trabajo
		@GetMapping("/empleados/trabajo/{trabajo}")
		public List<Empleado> listarEmpleadosTrabajo(@PathVariable(name="trabajo") String trabajo) {
		    return empleadoServiceImpl.listarEmpleadosTrabajo(trabajo);
		}
	
	
}
