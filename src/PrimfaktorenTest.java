public class PrimfaktorenTest {

    public static void main(String[] args) {
    	
    	System.out.println("4.4 TESTKLASSE (5 PUNKTE)");

        System.out.println("__________________");
        System.out.println("4.1 PRIMFAKTORZERLEGUNG (5 PUNKTE)");
        int[] primefaktorzahlen = Primfaktoren.primeFactorize(7644);
        System.out.println("Primfaktoren von 7644:");
        Primfaktoren.printNumbers(primefaktorzahlen);
        System.out.println();
       
        System.out.println("________________________________");
        System.out.println("4.2 GEMEINSAME PRIMFAKTOREN FINDEN (7 PUNKTE)");
        System.out.println("Primfaktoren von 330:");
        int[] primefaktorzahlen2 = Primfaktoren.primeFactorize(330);
        Primfaktoren.printNumbers(primefaktorzahlen2);
        System.out.println();
        System.out.println("____________________");
        System.out.println("4.3 GGT BERECHNEN(5 PUNKTE)");
        System.out.println("Gemeinsame Faktoren:");
        int[] a1 = Primfaktoren.findCommonPrimeFactors(primefaktorzahlen, primefaktorzahlen2);
        Primfaktoren.printNumbers(a1);
        System.out.println();
        System.out.println("_____________________");

        System.out.println("ggT von 7644 und 330:");
        Primfaktoren.calculateGgT(7644, 330);
        System.out.println(Primfaktoren.calculateGgT(7644, 330));


        System.out.println("______________________________");
        System.out.println();
        System.out.println("Primfaktoren von 1:");
        int[] primefaktorzahlen3 = Primfaktoren.primeFactorize(1);

        Primfaktoren.printNumbers(primefaktorzahlen3);

        System.out.println("Primfaktoren von 130:");
        int[] primefaktorzahlen4 = Primfaktoren.primeFactorize(130);
        Primfaktoren.printNumbers(primefaktorzahlen4);
        System.out.println();
        System.out.println("_________________________");

        System.out.println("Gemeinsame Faktoren:");
        int[] a2 = Primfaktoren.findCommonPrimeFactors(primefaktorzahlen3, primefaktorzahlen4);
        Primfaktoren.printNumbers(a2);

        System.out.println("ggT von 1 und 130:");
        Primfaktoren.calculateGgT(1, 130);

    }
}
