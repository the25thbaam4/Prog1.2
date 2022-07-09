
public class GGT {
	public static void main(String[]args) {
		System.out.println(ggt(24,81));
		System.out.println(kgv(11,13));
	}
    public static int ggt(int a, int b)
    {
        while(true) 
        {
            a = a % b;
            if(a == 0) return b;
            b = b % a;
            if(b == 0) return a;
        }
    }

    public static int kgv(int a, int b)
    {
        if(a == 0 || b == 0) return 1;
        else
        return (a*b)/ggt(a,b);
    }
}
