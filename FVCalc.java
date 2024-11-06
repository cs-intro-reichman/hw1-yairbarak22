// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// recieve data
		int currentValue = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);
		int n = Integer.parseInt(args[2]);
		// calculate
		double futurevalue = currentValue * Math.pow(rate/100 + 1, n);
		int futurevalue1 = (int) futurevalue;
		// print
		System.out.println("After " + n + " years, $" + currentValue + " saved at " + rate + "% will yield " + "$" + futurevalue1);  


	}
}

