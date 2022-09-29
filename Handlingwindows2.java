package package1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import config.Common;

public class Handlingwindows2  {
	WebDriver d;
	@Test
	public void testwindows1()
	{
		d.get("https://www.flipkart.com/");
		//d.findElement(By.linkText("Login")).click();
		d.findElement(By.xpath("//a[@href=\"/account/login?ret=/\"]")).click();
		d.close();
		
	}
	@BeforeMethod
	public void launch()
	{
		d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		d.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		d.manage().deleteAllCookies();
	}
	@AfterMethod
	public void exit()
	{
		d.quit();
	}
	
	}
