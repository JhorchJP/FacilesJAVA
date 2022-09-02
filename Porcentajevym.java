class Porcentajeaula{
	public static void main(String args[]) {
		
		int varones= 15;
		int mujeres= 20;
		int t=0;
		int pv=0;
		int pm=0;

		t=varones+mujeres;
		pv= varones*100/t;
		pm= mujeres*100/t;

		System.out.println("Porcentaje de varones y mujeres de un salon");
		System.out.println("Total de varones:  "+varones);
		System.out.println("total de mujeres:  "+mujeres);
		System.out.println("porcentaje de varones:  "+pv+"  %");
		System.out.println("porcentaje de mujeres:  "+pm+"  %");
	}
}