 
public class TimeFormat {
	public static void main(String[] args) {	
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		if(hours>12) {
			hours = hours-12;
			System.out.print(hours + ":");
			if(minutes<10) System.out.print("0" + minutes + " pm");	
			else System.out.print(minutes + " pm");
		}
		else {
			System.out.print(hours + ":");
			if(minutes<10) System.out.print("0" + minutes + " pm");	
			else System.out.print(minutes + " am");
		}
	}
}