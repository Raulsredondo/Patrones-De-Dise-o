package com.example.Patrones.Singleton.Prototype;

public class AutomovilShape {
	

	Integer nRuedas;
	
	
	
	
	
	public AutomovilShape() {
		super();
	}



	public AutomovilShape( Integer nRuedas) {
		super();
		
		this.nRuedas = nRuedas;
	
	}
	
	 public AutomovilShape clonar() throws CloneNotSupportedException {
		 
		 return (AutomovilShape) super.clone();
	 }
		
	

}
