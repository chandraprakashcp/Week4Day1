package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mousehove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//1. Load https://www.snapdeal.com/
		driver.get("https://www.snapdeal.com/");
		
		//2. Mouse hover on Men's Fashion and Click Shirts
		WebElement findElement = driver.findElement(By.xpath("//*[@id=\"leftNavMenuRevamp\"]/div[1]/div[2]/ul/li[7]/a/span"));
		Actions fasiontext= new Actions(driver);
		fasiontext.moveToElement(findElement).perform();
		driver.findElement(By.xpath("//*[@id=\"category6Data\"]/div[2]/div/div/p[3]/a/span")).click();
		
		//3. Mouse hover on the first product and Click on Quick View
		WebElement findElement2 = driver.findElement(By.xpath("//img[@class='product-image ']"));
		Actions quickviewtext = new Actions(driver);
		quickviewtext.moveToElement(findElement2).perform();
		driver.findElement(By.xpath("//div[contains(@class,'center quick-view-bar')]")).click();
		driver.close();
		//4. Close all the browsers

	}

}
