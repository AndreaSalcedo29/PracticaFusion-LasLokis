public class Principal {
	public static void main(String[] args) {

		Lobo loboP = new Lobo("Rodolfo", "azul");

		Culebra miCulebra = new Culebra("Juana", "Piton");

		Unicornio unicornio1 = new Unicornio("Fenix", 1);

		unicornio1.MandarMensaje();

		loboP.MandarMensaje();

		miCulebra.MandarMensaje();

	}

}