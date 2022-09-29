package package1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import config.Common;

public class Alerts1 {
	public WebDriver d;
	@Test
	public void handlingalerts() throws Exception
	{
		d.get("https://retail.onlinesbi.sbi/retail/login.htm");
		Thread.sleep(2000);
		d.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		Thread.sleep(2000);
        d.findElement(By.id("Button2")).click();
        //Thread.sleep(2000);
        Alert a1=d.switchTo().alert();
        a1.accept();
        d.findElement(By.id("username")).sendKeys("selenium");
        d.findElement(By.id("Button2")).click();
        a1.accept();
        Thread.sleep(3000);
        d.findElement(By.id("label2")).sendKeys("java");
        d.findElement(By.id("Button2")).click();
        a1.dismiss();
        Thread.sleep(3000);
			
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
