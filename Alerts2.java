package package1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import config.Common;

public class Alerts2 {
	public WebDriver d;
	@Test
	public void handlealerts() throws Exception
	{
		d.get("https://retail.onlinesbi.sbi/retail/login.htm");
		Thread.sleep(2000);
		d.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		Thread.sleep(2000);
		d.findElement(By.linkText("New User ? Register here/Activate")).click();
		Alert a2=d.switchTo().alert();
		a2.dismiss();
		Thread.sleep(2000);
		//a2.getText();
		d.findElement(By.linkText("Forgot Username / Login Password")).click();
		Thread.sleep(2000);
		
	}
	@BeforeMethod
	public void launch()
	{
		d=new FirefoxDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		d.manage().deleteAllCookies();	
	}
	@AfterMethod
	public void quit()
	{
		d.quit();
	}
	
}
