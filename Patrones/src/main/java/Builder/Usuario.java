package Builder;

public class Usuario {

	private String email;
	private String nombre;
	private String apellidos;
	private String telefono;
	private String direccion;

	Usuario() {
	}

	Usuario(UsuarioBuilder builder) {
		this.email = builder.getEmail();
		this.nombre = builder.getNombre();
		this.apellidos = builder.getApellidos();
		this.telefono = builder.getTelefono();
		this.direccion = builder.getDireccion();
	}
}
