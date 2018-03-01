//WAP to handle dropdown menus present on ISTQ.in website
//Navigate from Foundation -> Enrollment -> Corporate Enrollment
package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingDropDownMenu {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://istqb.in/");
		
		WebElement foundationLink = driver.findElement(By.xpath("//span[text()='FOUNDATION']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(foundationLink).perform();
		Thread.sleep(1000);
		
		WebElement enrollmentLink = driver.findElement(By.xpath("//span[text()='ENROLLMENT']"));
		action.moveToElement(enrollmentLink).perform();
		Thread.sleep(1000);
		
		WebElement corEnrollment = driver.findElement(By.xpath("//a[@title='CORPORATE ENROLLMENT']"));
		action.moveToElement(corEnrollment).perform();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[text()='ONLINE ENROLLMENT']")).click();
		
		
		
		
		

	}

}
