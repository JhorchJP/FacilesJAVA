class Convertidorsolesadolares{
	public static void main(String args[]) {
		float soles = 100;
		float tipocambio = 4;
		float dinerocambiado;

		dinerocambiado = soles * tipocambio;

		System.out.println("Convertidor de soles a dolares");
		System.out.println("Soles a cambiar:  "+soles);
		System.out.println("Valor del tipo de cambio:  "+tipocambio);
		System.out.println("dinero cambiado a dolares es:  "+dinerocambiado);
	}
}