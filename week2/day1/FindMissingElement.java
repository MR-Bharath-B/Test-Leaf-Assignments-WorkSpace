package week2.day1;

import java.util.Arrays;

public class FindMissingElement {
	public static void main(String[] args) {
		int[] num= {1,4,3,2,8,6,7};
		int sum1=0;
		int sum2=0;
		Arrays.sort(num);
		System.out.println("Size of the Array: "+num.length);
		for (int i = 0; i < num.length; i++) {
			sum1=sum1+num[i];
		}
		for (int j = 0; j <=8; j++) {
			sum2=sum2+j;
		}
		System.out.println("Missing Element in the Array: "+(sum2-sum1));
		
	}

}
