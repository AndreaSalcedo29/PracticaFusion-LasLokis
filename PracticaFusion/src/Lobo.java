
public class Lobo extends Mascota {
	private String color;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Lobo(String nombre) {
		super(nombre);
		
	}
	
	public Lobo(String nombre, String color) {
		super(nombre);
		this.color = color;
	}

	public void MandarMensaje() {
		System.out.println("Soy " + this.getNombre() + " auuuuuuuuuuuuuuuu y de color "+this.getColor());
	}
}
