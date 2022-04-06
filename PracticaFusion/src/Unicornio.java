
public class Unicornio extends Mascota{

	private int cuerno;
	
	public Unicornio(String nombre,int cuerno) {
		super(nombre);
		// TODO Auto-generated constructor stub
		this.cuerno = cuerno;
	}
	
	public void MandarMensaje() {
		System.out.println("Soy " + this.getNombre() + " ji ji ji");
	}

}
