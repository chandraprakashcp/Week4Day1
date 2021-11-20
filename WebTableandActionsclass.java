package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableandActionsclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(" http://www.leafground.com/pages/table.html");
		List<WebElement> rowdetails = driver.findElements(By.xpath("//table[@id='table_id']//tr"));
		
		int rowsize = rowdetails.size();
		for (int i = 2; i < rowsize; i++) {
			
			List<WebElement> columndetails = driver.findElements(By.xpath("//table[@id='table_id']//tr/td"));
			int colsize = columndetails.size();
			
			for (int j = 1; j < colsize; j++) {
				
				String tdtext= driver.findElement(By.xpath("//table[@id='table_id']//tr["+i+"]/td["+j+"]")).getText();
				System.out.println(tdtext);
				
			}
		}
	}

}
