package week2.day1;

public class FibonacciSeries {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c;
		System.out.println("Fibonacci Series No:");
		System.out.print(a+",");
		System.out.print(b+",");
		for (int i = 0; i <=5; i++) {
			c=a+b;
			if (i==5) {
				System.out.print(c+".");	
			} 
			else {
				System.out.print(c+",");
			}
			a=b;
			b=c;
		}
	}

}
