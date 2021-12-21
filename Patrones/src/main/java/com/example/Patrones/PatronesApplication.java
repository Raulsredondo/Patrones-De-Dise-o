package com.example.Patrones;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Patrones.Singleton.Persona;
import com.example.Patrones.Singleton.Prototype.Coche;
import com.example.Patrones.Singleton.Prototype.Moto;

import Builder.Usuario;
import Builder.UsuarioBuilder;

@SpringBootApplication
public class PatronesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PatronesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Implementacion de el Patron de diseño Singleton con la classe Persona \n ");
		
		Persona p1 = Persona.Instancia(18, "Raul");
		Persona p2 = Persona.Instancia(20, "Manuel");
		
		System.out.println("Esta es la comprovacion en la que los dos objetos tienen espacio en momoria \n" + p1 +"\n"+ p2);
		
		
		System.out.println("-------------------------------------------------------------------------------------------------");
		
		
		System.out.println("Implementacion de el Patron de diseño Prototype con la clases Coche y Moto \n ");  
		
		Coche c1 = new Coche(4, "Seat", "Ibiza");
		Moto m1 = new Moto(2, "Honda", "X230");
		
		System.out.println("Esta es la comproacion en la que los dos objetos estan clonados \nCoche \n" + c1.toString() +"\nMoto \n"+ m1.toString());
		
		System.out.println("-------------------------------------------------------------------------------------------------");
		
	    Usuario usuario = new UsuarioBuilder()
	            .email("nombre.apellido@gmail.com")
	            .nombre("Nombre", "Apellido")
	            .telefono("555123456")
	            .direccion("c Rue el Percebe 13").build();   
	      
	}



}
