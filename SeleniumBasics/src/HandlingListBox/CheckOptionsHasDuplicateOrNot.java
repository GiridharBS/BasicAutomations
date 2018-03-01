package HandlingListBox;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckOptionsHasDuplicateOrNot {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/Practise/SampleWebpages/ListBox2.html");
		WebElement lstBox = driver.findElement(By.id("SLV"));
		
		Select select = new Select(lstBox);
		List<WebElement> allOptions = select.getOptions();
		HashSet<String> allText = new HashSet<String>();
		
		for(int i=0;i<allOptions.size();i++)
		{
			allText.add(allOptions.get(i).getText());
		}
		
		if(allOptions.size()==allText.size())
		{
			System.out.println("ListBox does not have duplicate options");
		}
		else
		{
			System.out.println("ListBox has duplicate elements");
		}
		
		driver.close();

	}

}
