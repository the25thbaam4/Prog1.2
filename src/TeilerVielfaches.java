
public class TeilerVielfaches {

	public static void main(String[]args) {

		//ggT
		System.out.println("ggT");
		System.out.println();
		System.out.println(ggTrekursiv(24,9));
		System.out.println(ggTrekursiv(4,4));
		System.out.println(ggTrekursiv(11,13));
		System.out.println(ggTrekursiv(2,0));
		System.out.println("__________");
		System.out.println();

		System.out.println(ggTrekursiv(24,81));
		System.out.println(ggTrekursiv(4,4));
		System.out.println(ggTrekursiv(11,13));
		System.out.println(ggTrekursiv(2,0));
		System.out.println(ggTrekursiv(70,84));

		System.out.println("__________");
		System.out.println();

		//kgV
		System.out.println("kgV");
		System.out.println();
		System.out.println(kgV(24,81));
		System.out.println(kgV(4,4));
		System.out.println(kgV(11,13));	
		System.out.println(kgV(2,0));
		System.out.println();
		System.out.println("__________");


		//Zahlenpaare
		System.out.println("Zahlen Paare");
		gibZahlenpaareAus(70, 100,13);
	}

	public static int ggTrekursiv (int x, int y) {

		while(y!=0) { // somit können wir y (== 0) vermeiden können.
			if (x % y == 0 ) // wenn x%y= 0 dann gleiche Zhalen bedeuten x || y ist ggT

				return y;

			else

				return ggTrekursiv(y,x%y); // anderenfall ist hier richtig. 
		}
		return 0;
	}


	public static int kgV (int x, int y) {
		if (x==0 || y==0)  // damit 0 problem zu vermeiden, dann 0 * etwas ist null.
			return 1;


		else
			return (x*y)/ggTrekursiv(x,y); // kgV * ggT = x*y Mathe halt.


	}
	public static void gibZahlenpaareAus (int x, int y, int minimal) { // parameter für die methode.

		for(int i = x; i <= y; i++) {   // mit x,y begrenzen wir die intervalle zischen den beiden zahlen.
			if (x!=i) {  // damit sichern wir, dass gleiche Zahlen nicht berücktsichtig wird.
				int ggT = ggTrekursiv(x,i); 
				if (ggT > minimal) { // hier muss ggT größer als unsere minimalwert sein wie in der Aufgabe 13.
					System.out.println("(" + x + "," + i + ")");
				}
			}
		}
	}
}


