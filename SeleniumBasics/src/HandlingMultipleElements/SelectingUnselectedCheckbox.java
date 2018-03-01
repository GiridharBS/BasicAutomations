package HandlingMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectingUnselectedCheckbox {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/Practise/SampleWebpages/Checkbox.html");
		
		List<WebElement> allCB = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(allCB.size());
		
		for (int i=0;i<allCB.size();i++)
		{
			if(allCB.get(i).isSelected())
			{
			
				System.out.println("Selected checkbox count" +i);
			}
			else
			{
				System.out.println("Not selected CB "+i);
				allCB.get(i).click();
			}
		}
		
	}

}
