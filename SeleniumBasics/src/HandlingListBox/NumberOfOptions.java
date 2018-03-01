//WAP to count the number of options present in the listbox
package HandlingListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NumberOfOptions {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/Practise/SampleWebpages/ListBox1.html");
		WebElement lstBox = driver.findElement(By.id("mtr"));
		
		Select select = new Select(lstBox);
		List<WebElement> noOfOptions = select.getOptions();
		System.out.println(noOfOptions.size());
		
		driver.close();
		

	}

}
