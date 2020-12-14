package SImple;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchAUT {
	@Test
	public void LaunchAUT() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANIL CH\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		  driver.get("https://login.salesforce.com/?locale=in");
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
  }
}
