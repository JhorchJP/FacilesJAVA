class Salariomensual{
	public static void main(String args[]) {
		
		int horastrabajadas= 8;
		int ganaporhora=5;
		int mensualidad=0;

		mensualidad = horastrabajadas * ganaporhora * 30;

		System.out.println("--Calculando salario mensual--");
		System.out.println("Trabaja  "+horastrabajadas+"  H");
		System.out.println("Gana S/.  "+ganaporhora+"  por cada hora");
		System.out.println("Mensualidad es S/.  "+mensualidad);
	}
}