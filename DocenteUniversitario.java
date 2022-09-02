class DocenteUniversitario
{	//declaracion de variables
	public int codigo= 2020210340;
	
	public String nombre= "albert einstein";

	public int dni= 12345678;

	public String materia= "Matematica Pura" ;

    //mostrar datos
	public int mostrarCodigoDocente()
	{
		return codigo;
	}

	public String mostrarNombre()
	{
		return nombre;
	}

	public int mostrarDNI()
	{
		return dni;
	}

	public String mostrarMateria()
	{
		return materia;
	}

	//mostrar para compilar
	public static void main(String args[])
	{
		System.out.println("**** Mostrar datos Docente Universitario ****");

		DocenteUniversitario du = new DocenteUniversitario();

		System.out.println("codigo docente: "+du.mostrarCodigoDocente());

		System.out.println("nombre docente: "+du.mostrarNombre());

		System.out.println("DNI docente: "+du.mostrarDNI());

		System.out.println("Materia a enseñar: "+du.mostrarMateria());



	}


}