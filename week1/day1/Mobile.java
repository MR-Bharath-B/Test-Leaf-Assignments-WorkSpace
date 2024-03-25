package week1.day1;

public class Mobile {
	public void makeCall() {
		String mobileModel="ROG 2";
		float mobileWeight=8.47f;
		System.out.println(mobileModel +" Mobile");
		System.out.println(mobileWeight +" Weight");
	}
	public void sendMsg() {
		boolean isFullCharged=true;
		int mobileCost=39000;
		System.out.println(isFullCharged +" fully charged");
		System.out.println(mobileCost +" is my mobile cost");

	}

	public static void main(String[] args) {
		Mobile rogMobile=new Mobile();
		System.out.println("This is My Mobile Specification :");
		rogMobile.makeCall();
		rogMobile.sendMsg();

	}

}
