class Teoremapita{
	public static void main(String args[]) {

		int catetoa = 6;
		int catetob = 8;
		
		double hipotenuza = Math.sqrt(Math.pow(catetoa, 2)+Math.pow(catetob, 2));	

		System.out.println(">>Teorema Pitagoras<<");
		System.out.println("el cateto A es  "+Math.pow(catetoa,2));
		System.out.println("el cateto B es  "+Math.pow(catetob,2));
		System.out.println("la hipotenuza es  "+hipotenuza);
	}
}