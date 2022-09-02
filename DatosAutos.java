class DatosAutos
{
	public String marca= "Toyota";
	public String modelo= "Fortuner";
	public String color= "Blanco";
	public int placa= 901229;

	public String mostrarMarca()
	{
		return marca;
	}
	public String mostrarModelo()
	{
		return modelo;
	}
	public String mostrarColor()
	{
		return color;
	}
	public int mostrarPlaca()
	{
		return placa;
	}

	public static void main(String args[])
	{
		System.out.println("---DATOS DE UN AUTO---");
		DatosAutos datosu = new DatosAutos();
		System.out.println("marca del auto: "+datosu.mostrarMarca());
		System.out.println("modelo del auto: "+datosu.mostrarModelo());
		System.out.println("color del auto: "+datosu.mostrarColor());
		System.out.println("placa del auto: "+datosu.mostrarPlaca());
	}
}