package ToolTip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingToolTips {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String expectedMandatoryMsg = "What's your Name?s";
		
		driver.findElement(By.id("u_0_13")).click();
		driver.findElement(By.name("firstname")).click();
		WebElement text = driver.findElement(By.xpath("//div[@class='_5633 _5634 _53ij']"));
		
		if(expectedMandatoryMsg.equalsIgnoreCase(text.getText()))
		{
			System.out.println("Pass: Mandatory message for First name is displayed");
		}
		else
		{
			System.out.println("Fail: Mandatory message for first name is not displayed");
		}
	}
}
