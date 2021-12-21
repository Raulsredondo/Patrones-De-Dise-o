package com.example.Patrones.Singleton.Prototype;

public class Moto extends AutomovilShape{
	
	String marca;
	String modelo;
	
	
	public Moto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Moto(Integer nRuedas, String marca, String modelo) {
		super(nRuedas);
		
		this.marca = marca;
		this.modelo = modelo;
		// TODO Auto-generated constructor stub
		
		
	}
	
}
