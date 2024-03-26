package week2.day1;

public class IsPalindrome {
	public static void main(String[] args) {
		int a=12121;
		int b=a;
		int rem;
		int rev=0;
		while (b!=0) {
			rem = b%10;
			rev=rev*10+rem;
			b=b/10;

		}
		if (a==rev) {
			System.out.println(a+" is a Palindrome Number");

		} 
		else {
			System.out.println(a+" is Not a Palindrome Number");
		}
	}
}
