package qsp;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GroupingConceptinTestNG {
	
	@BeforeMethod (alwaysRun=true)
	public void login()
	{
		Reporter.log("Login",true);
	}
	
	@AfterMethod (alwaysRun=true)
	public void logout()
	{
		Reporter.log("Logout",true);
	}
	
	@Test (groups= {"user","smoke"})
	public void createUser()
	{
		Reporter.log("CreateUser",true);
	}
	
	@Test (groups= {"user"}, enabled=false)
	public void deleteUser()
	{
		Reporter.log("delete user",true);
	}
	
	@Test (groups= {"product","smoke"})
	public void editProduct()
	{
		Reporter.log("editProduct",true);
		Assert.fail("It failed again....");
	}
	
	@Test (groups= {"report","smoke"})
	public void getReport()
	{
		Reporter.log("getReport",true);
	}
}
