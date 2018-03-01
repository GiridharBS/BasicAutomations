package HandlingListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {

	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws Exception  {

		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/Practise/SampleWebpages/ListBox1.html");
		
		WebElement listBox = driver.findElement(By.id("mtr"));
		
		Select select = new Select(listBox);
		select.selectByValue("d");
		Thread.sleep(1000);
		select.selectByVisibleText("Vada");
		Thread.sleep(1000);
		select.selectByIndex(0);
		

	}

}
