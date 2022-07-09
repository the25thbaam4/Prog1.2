
public class Kindergeld {
	
	public static void main(String[]args) {
		
		int anzahlkinder = 10;
		int kindergeld;
		
		switch (anzahlkinder) {
		
			case 0: kindergeld = 0; break;
			case 1: kindergeld = 1000; break;
			case 2: kindergeld = 2200; break;
		
		default: kindergeld = anzahlkinder * 1500;
		
		}
		
		System.out.println("Kindergeld beträgt "  + kindergeld +  " EUR.");
	}

}



