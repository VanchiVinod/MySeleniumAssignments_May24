package week1.day1;

public class FireFox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float browserVersion = 100.2f;
		String browserName = "firefox";
		boolean isVisible = true;
		int releaseYear = 1998;
		char browserLogo = 'f';
		
		System.out.println(browserVersion+"\n"+browserName+"\n"+isVisible+"\n"+releaseYear+"\n"+browserLogo);
		
		int a =10;
		for (int i=0; i<a ; i++) {
			if (i==5) {
				continue;
			}
			if (i == 6) {
				continue;
			}
			System.out.println(i);
		}
	}

}
