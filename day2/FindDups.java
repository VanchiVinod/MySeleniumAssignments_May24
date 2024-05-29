package week1.day2;

import java.util.Arrays;

public class FindDups {

	int[] num={2, 5, 7, 7, 5, 9, 2, 3};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FindDups fdnew = new FindDups();
		int numbers[] = fdnew.num;
		
		Arrays.sort(numbers);
//		System.out.println(numbers[(numbers.length)-1]);
		
		for (int i=0; i< numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		
	}

}
