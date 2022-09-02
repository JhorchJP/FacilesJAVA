class Elevacioncubo{
	public static void main(String args[]) {
		
		double numero=5;
		int elevar=3;
		double resultado;

		resultado=Math.pow(numero, elevar);

		System.out.println("--Elevacion al cubo--");
		System.out.println("Numero a elevar:  "+numero);
		System.out.println("elevado a:  "+elevar);
		System.out.println("Resultado es:  "+resultado);
	}
}