package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =12;
		int count=0;
		
		if (num>1) {
			for(int i=0; i<num; i++) {
				if (num%2 == 0) {
					count++;
				}
			}
			if (count>2) {
				System.out.println("This is not a Prime Number");
			}
			else {
				System.out.println("This is a Prime Number");
			}
		}
		else {
			System.out.println("This is not a Prime Number");
		}

}
}
