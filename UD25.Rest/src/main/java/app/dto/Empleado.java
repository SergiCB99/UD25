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
	
	public Empleado(String nombre, String trabajo) {
		this.nombre=nombre;
		this.trabajo=trabajo;
		this.salario=comprobarSalario(trabajo);
	}

	public int comprobarSalario(String trabajo) {
		int salario = 0;
		
		switch(trabajo) {
			case "Junior":
				salario=1000;
			break;
			case "Mid":
				salario=2000;
			break;
			case "Senior":
				salario=3000;
			break;
		}
		
		return salario;
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
