package week1.day1;

public class EvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,45,677,87,3,87, 6745,75,764, 63};
		int[] x = {}; 
		
		for (int i=0; i<a.length-1; i++) {
			if (i%2 == 0) {
				
				System.out.println(a + " is an Even Number");
			}
			else {
				System.out.println(a + " is not a Even Number");
			}
			
		}
		
	}
}	
