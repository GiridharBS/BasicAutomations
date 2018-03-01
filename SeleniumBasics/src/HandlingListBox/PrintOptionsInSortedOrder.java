//WAP to print the options in sorted order
package HandlingListBox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintOptionsInSortedOrder {
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
		ArrayList<String> allText = new ArrayList<String>();
		
		for (int i=0;i<allOptions.size();i++)
		{
			String text = allOptions.get(i).getText();
			allText.add(text);
		}
		
		Collections.sort(allText);
		for(String txt:allText)
		{
			System.out.println(txt);
		}
	}

}
