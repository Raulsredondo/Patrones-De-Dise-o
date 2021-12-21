package com.example.Patrones.Singleton.Prototype;

public class Coche extends AutomovilShape{
	
	String marca;
	String modelo;
	
	
	
	public Coche() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Coche(Integer nRuedas, String marca, String modelo) {
		super(nRuedas);
		
		this.marca = marca;
		this.modelo = modelo;
		// TODO Auto-generated constructor stub
		
		
	}
	

	
	

}
