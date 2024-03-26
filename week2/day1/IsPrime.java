package week2.day1;

public class IsPrime {
	public static void main(String[] args) {
		for (int i = 1; i <=20; i++) {
			if(i==0 && i==1)
			{
				System.out.println(i + " --> NOT A PRIME NUMBER");	
			}
			else {
				int count=0;
				for (int j = 1; j <=i; j++) {
					if (i%j==0) {
						count++;
					} 
				}
				if (count==2) {
					System.out.println(i + " --> IS A PRIME NUMBER");	

				} else {
					System.out.println(i + " --> NOT A PRIME NUMBER");	

				}
			}
		}
	}

}


