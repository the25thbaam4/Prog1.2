
public class Primfaktoren {

    public static int[] primeFactorize(int num) {    
        int[] sampleArray = new int[10];
        int co = 0;

        int x = num;
        try {
            if (x >= 2) {
                for (int i = 2; i <= x; i++) {
                    while (x % i == 0) {
                        x = x / i;
                        co = co + 1;
                        Primfaktoren.setNumber(sampleArray, co, i);
                    }
                }
            } else {
                throw new IllegalArgumentException();
            }

        } catch (Exception e) {
            System.out.println("Die Zahl muss grosser als 1 sein.");
        }

        return sampleArray;
    }

    public static int setNumber(int[] array, int index, int element) { //add in Array
        if ((0 <= index) && (index < array.length)) {
            array[index] = element;
            return index + 1;
        } else
            return -1;
    }

    public static void printNumbers(int[] x) {  //print array nums
        for (int i = 0; i < x.length; i++) {
            if (x[i] == 0) {
            } else {
                System.out.print(x[i] + "  ");
            }
        }
    }

    public static int[] findCommonPrimeFactors(int[] prime1, int[] prime2) {   //print commen prime facotres as Arrays
        int[] reArray = new int[10];
        int free = 0;
        try {
            if (prime1 != null) {
                if (prime2 != null) {
                    for (int i = 0; i < prime1.length; i++) {
                        for (int k = 0; k < prime2.length; k++) {
                            if (prime1[i] == prime2[k]) {
                                if (prime1[i] != 0) {
                                    free = Primfaktoren.setNumber(reArray, free, prime1[i]);
                                }
                            }
                        }
                    }
                } else {
                    throw new ArrayIndexOutOfBoundsException();
                }
            } else {
                throw new ArrayIndexOutOfBoundsException();
            }
        } catch (Exception e) {
            System.out.println("Array is Null dude.");
        }
        return reArray;
    }


    public static int calculateGgT(int no1, int no2) {    //calculate ggT 
        int no1Array[] = Primfaktoren.primeFactorize(no1);
        int no2Array[] = Primfaktoren.primeFactorize(no2);

        try {
            if ((no1 < 1) | (no2 < 1)) {
                throw new IllegalArgumentException();
            }
        } catch (Exception e) {
            System.out.println("is < 1");
        }

        int[] ggtArray = Primfaktoren.findCommonPrimeFactors(no1Array, no2Array);
        int a = Primfaktoren.multi(ggtArray);

        return a;
    }

    public static int multi(int[] arr) {  //multiplay prime factores
        int jede = 1;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] != 0) {
                if (arr[i] != jede)
                    jede = jede * arr[i];
            }
        return jede;
    }

}





