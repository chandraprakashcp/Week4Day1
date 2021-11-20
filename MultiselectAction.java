package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiselectAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leafground.com/pages/Dropdown.html");
		WebElement item1 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select/option[2]"));
		WebElement item2 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select/option[5]"));
		
		Actions mulselect= new Actions(driver);
		mulselect.keyDown(Keys.CONTROL).click(item1).click(item2).keyUp(Keys.CONTROL).perform();
		

	}

}
