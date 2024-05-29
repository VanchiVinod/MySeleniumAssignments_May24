package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 121;
		int reverse = 0;  
		//we have not mentioned the initialization part of the for loop  
		for( ;input != 0; input=input/10)   
			{  
			int remainder = input % 10;  
			reverse = reverse * 10 + remainder;  
			}  
		if (input == reverse) {
			System.out.println("This is a Palindrome Number");
			}
		System.out.println("The reverse of the given number is: " + reverse);  
	
		
	}
}

