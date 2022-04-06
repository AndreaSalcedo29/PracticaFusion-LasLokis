public class Mascota {

	private String nombre;
	private boolean genero;

	public Mascota(String nombre, boolean genero) {
		super();
		this.nombre = nombre;
		this.genero = genero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isGenero() {
		return genero;
	}

	public void setGenero(boolean genero) {
		this.genero = genero;
	}

	public void MandarMensaje() {
		System.out.println("Hola Soy" + this.nombre + " y soy del sexo " + this.genero);
	}

}