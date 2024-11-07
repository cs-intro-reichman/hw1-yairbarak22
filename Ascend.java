// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		int a = (int)(Math.random() * lim);
		int b = (int)(Math.random() * lim);
		int c = (int)(Math.random() * lim);
		System.out.println(a +" "+ b +" " + c);
		// claculate min / max
		int minab = Math.min(a,b);
		int min = Math.min(minab,c);
		int maxab = Math.max(a,b);
		int max = Math.max(maxab,c);
		int center = (a+b+c)-(min+max);
		System.out.println(min + " "+ center + " " + max);

	}
}
