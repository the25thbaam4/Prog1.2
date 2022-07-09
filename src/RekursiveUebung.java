
public class RekursiveUebung {

	public static void main(String[]args) {


		System.out.println(rechne(77,40));
		
		brechnePotenz(5,5);
		System.out.println(brechnePotenz(5,5));
		int erg = brechnePotenz(2,3);
		System.out.println(erg);
		System.out.println(multipliziere(-1,-2));
		
		System.out.println(summiereIterativ(6));
		
		
		
	}

	public static double rechne(int a, int b) {
		double erg = (a + b) / 2;
		
		return erg;

	}



	public static int multipliziere(int x , int y) {
		int produkt = 0;
		for(int i = 0; i != y; i++) {
			produkt = produkt + x;

		}
		
		return produkt;

	}

	public static int brechnePotenz(int a, int b) {

		if (b <= 0) 
			return 1;	

		else
			
			return a * brechnePotenz(a,b-1);
				
		

	}

	public static int summiereIterativ(int n) {
		
		for(int k = 0; k <=n ;k++) {}
		int summe =n*(n+1)/2;
		return summe;
		
		
	}
	

	
	
	
}

