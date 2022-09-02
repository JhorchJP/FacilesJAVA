class Salarionuevo{
	public static void main(String args[]) {
		int salarioactual = 1500;
		int x=0;
		int salarionuevo =0;

		x=25*salarioactual/100;
		salarionuevo=salarioactual+x;

		System.out.println("salario nuevo ");
		System.out.println("Salario actual:  "+salarioactual);
		System.out.println("Aumento de 25% ");
		System.out.println("salario nuevo:  "+salarionuevo);
	}
}