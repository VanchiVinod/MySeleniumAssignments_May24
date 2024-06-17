package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase1 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(" http://www.pvrcinemas.com/");
		
		driver.findElement(By.xpath("//h6[text()='Chennai']")).click();
		driver.findElement(By.xpath("//span[text()='Movie']/following-sibling::span")).click();
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//ul[@role='listbox']//li)[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//ul[@role='listbox']/li[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ul[@role='listbox']/li[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ul[@role='listbox']/li[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Book']/parent::button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='all-seats']//td[12]")).click();
		Thread.sleep(3000);
		
		System.out.println("Booking Summary:");
		String moviename = driver.findElement(By.xpath("//div[@class='summary-movies-content']/h5")).getText();
		System.out.println("Movie Name: "+moviename);
		
		String category = driver.findElement(By.xpath("//div[@class='summary-movies-content']//p")).getText();
		System.out.println("Booking Time: "+category);
		
		String amount = driver.findElement(By.xpath("//div[@class='grand-prices']/h6")).getText();
		System.out.println("Price of Ticket: "+amount);
		
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		
		String grandprice = driver.findElement(By.xpath("//div[@class='grand-tota col-md-3']//span")).getText();
		System.out.println("Grand Total Amount = "+grandprice);
		
		if (parserint(amount) == parserint(grandprice)) {
			driver.findElement(By.xpath("//button[text()='Proceed']")).click();  
		}
		else {
			System.out.println("Price doesn't Match, Please check");			
		}
		
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(5000);
		driver.close();
		
	}

	private static String parserint(String amount) {
		// TODO Auto-generated method stub
		return null;
	}

}
