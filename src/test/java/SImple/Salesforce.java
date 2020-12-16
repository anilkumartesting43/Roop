package SImple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Salesforce{
	WebDriver driver;
	@Test(priority=1)
	public void LaunchAUT() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANIL CH\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://login.salesforce.com/?locale=in");
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
  }
	
	@Test(priority=4)
	public void CloseAUT()
	{
		driver.close();
	}
	@Test(priority=2)
	public void Login() throws InterruptedException
	{
		driver.findElement(By.id("username")).sendKeys("anilkuartesting43@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Anil435");
		Thread.sleep(1000);
		driver.findElement(By.id("Login")).click();
	}
	@Test(priority=3)
	public void Gettext()
	{
		String act=driver.getTitle();
		System.out.println("the title is"+act);
		String Ext="Welcome to Salesforce";
		if(Ext.equalsIgnoreCase(act))
		{
			System.out.println("the result is pass");
			
		}
		else 
		{
			System.out.println("the result is faild");
		}
		
		
	}
}