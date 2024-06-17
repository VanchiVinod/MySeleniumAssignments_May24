package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class TestCase2 {

	public static void main(String[] args) {
		
		 EdgeDriver driver = new EdgeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
		 driver.get("https://www.amazon.in/");
		 
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for b");
		 
		 driver.findElement(By.xpath("//span[text()='oys']")).click();
		 
		 String ttle = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']/span")).getText();
		 
		 System.out.println(ttle);
		 
		 driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[1]")).click();
		 
		 driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[2]")).click();
		 
		 driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']/span")).click();
		 
		 driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		 
		 String brand = driver.findElement(By.xpath("//div[@class='a-row a-size-base a-color-secondary']//span")).getText();
		 System.out.println("Brand Name: "+ brand);
		 
		 String Bagdesc = driver.findElement(By.xpath("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']//span")).getText();
		 System.out.println("Bag Description: "+ Bagdesc );
		 
		 String price = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		 System.out.println("Price: "+price);
		 
		 String title = driver.getTitle();
		 System.out.println("Title of the Page: "+title);
		 
		 driver.close();
		 

	}

}
