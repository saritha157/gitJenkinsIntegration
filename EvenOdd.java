package numbers;

public class EvenOdd {

	public static void main(String[] args) {
	
		System.out.println(evenOdd(124));
		System.out.println(evenOdd(123));
		

	}
	
	public static String evenOdd(int num) {
		if(num%2==0) {
			return "It's a even number";
		}
		 return "It's a odd number";
	}

}
