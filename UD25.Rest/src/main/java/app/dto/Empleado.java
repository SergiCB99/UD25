package app.dto;

import javax.persistence.*;

@Entity
@Table(name="empleados")//en caso que la tabala sea diferente
public class Empleado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private Long id;
	@Column(name = "nombre")//no hace falta si se llama igual
	private String nombre;
	@Column(name = "trabajo")//no hace falta si se llama igual
	private String trabajo;
	@Column(name = "salario")//no hace falta si se llama igual
	private int salario;
	
	public Empleado() {
		
	}
	
	public Empleado(String nombre,String trabajo) {
		this.nombre=nombre;
		comprobarTrabajo(trabajo);
		comprobarSalario();
	}

	public void comprobarSalario() {
		int salario=0;
		
		if(trabajo.equalsIgnoreCase("Junior")) {
			salario=1000;
		}else if(trabajo.equalsIgnoreCase("Mid")){
			salario=2000;
		}else if(trabajo.equalsIgnoreCase("Senior")){
			salario=3000;
		}
		
		this.setSalario(salario);
	}
	
	public void comprobarTrabajo(String trabajo) {
		String trabajo_final;
		
		if(trabajo.equalsIgnoreCase("Junior")||trabajo.equalsIgnoreCase("Mid")||trabajo.equalsIgnoreCase("Senior")) {
			trabajo_final=trabajo;
		}else {
			trabajo_final="Junior";
		}
		
		this.setTrabajo(trabajo_final);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(String trabajo) {
		
		this.trabajo = trabajo;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		
		this.salario = salario;
	}

	
	
}
