
public class Toechter {

	public static void main(String[]args){


		for (int x = 1; x <=36 ; x++) {       //da wir 3 Töchter haben x,y,z müssen wir 3 schleifen haben also geschachtelte Schleifen für alle Töchter.

			for (int y = 1; y <= 36; y++) { //x,y,z = 1 weil sie müssen mindestens 1 Jahr alt sein 

				for (int z = 1; z <=36 ; z++) { // Allerdings ohne ein Limit lieferen die schleifen viele möglichkeiten und große zahlen.

					if (x<=y && y<=z)  { // wir haben 2 hinweise bekommen x<=y<=z in if mit && verdnunden.

						if (x*y*z ==36) { // 2. Hinweis x*y*z==36 ansonten große zahlen.

							//erg = x*y*z=36 ;		
							int erg =x*y*z; // hiermit begrenzen wir uns auf die Zahl 36 > oder < sind falsch
							int hn = x+y+z; // mit den richtigen ergebinssen können wir unsere antworten noch besser nähren. 

							System.out.print(erg+"   "); // die richtigen Antworten liefern 36
							System.out.print(hn +" = "); // die wiederholte ergebnis ist richtig. uns bleiben 2 Möglichkeiten 6+6+1 oder 2+2+9 aber es gibt ältste Tochter (9) ist richtig.
							System.out.println(x+"+"+y +"+"+z+" "); //



						}

					}

				}		

			}

		}
		
	}
}

/*
wir wissen, dass x*y*z=36 dann müssen wir 3 intiger Zahlen multiplitzieren und auf genau 36 kommen
dadurch begrenzen wir uns auf eine kleine Kommbination von 3 Zahlen.

1*2*18
1*3*12
1*4*9
1*6*6
2*2*9 
2*3*6
3*3*4  jede = 36

und die Addition 
     21 = 1+2+18 
     16 = 1+3+12 
     14 = 1+4+9 
     13 = 1+6+6 
     13 = 2+2+9 
     11 = 2+3+6 
     10 = 3+3+4 
     
     
     13 wiederholt sich (der verkäufer hat die Hausnummer 2 mal gesehen) 6+6+1 oder 2+2+9 da es eine altste Tochter gibt, macht es 2+2+9 richtig.


*/



