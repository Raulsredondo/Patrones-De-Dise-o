package com.example.Patrones.Singleton;

public class Persona {
	
	
	private Integer edad;
	private String nombre;
	private static Persona instanciaPersona;
	
	public Persona(Integer edad, String nombre) {
		super();
		this.edad = edad;
		this.nombre = nombre;
	}
	
	
	public static Persona Instancia(Integer edad, String nombre) {
		if(instanciaPersona == null) {
			instanciaPersona = new Persona(edad, nombre);
		}
		return instanciaPersona;
	}


	/**
	 * @return the edad
	 */
	public Integer getEdad() {
		return edad;
	}


	/**
	 * @param edad the edad to set
	 */
	public void setEdad(Integer edad) {
		this.edad = edad;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the instanciaPersona
	 */
	public static Persona getInstanciaPersona() {
		return instanciaPersona;
	}


	/**
	 * @param instanciaPersona the instanciaPersona to set
	 */
	public static void setInstanciaPersona(Persona instanciaPersona) {
		Persona.instanciaPersona = instanciaPersona;
	}
	
	

}
