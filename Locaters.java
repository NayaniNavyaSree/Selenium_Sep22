package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Locaters {
        WebDriver d;
	    @BeforeMethod
	    public void launch()
	    {
		//set the path
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\C.AMARNATH\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		// to launch the browser
		d=new FirefoxDriver();
	    }
	    @Test
	    public void steps() throws Exception
	    {
		//to load the web page
		d.get("https://www.facebook.com/");
		//d.get("https://www.gmail.com/");
		//ID
		//d.findElement(By.id("pass")).sendKeys("Selenium");
		//xpath
		d.findElement(By.xpath("//input[@id='email']")).sendKeys("navyasree1237@gmail.com");
		d.findElement(By.xpath("//input[@name='pass']")).sendKeys("07f51a1237");
		d.findElement(By.xpath("//button[@type='submit']")).click();
		d.findElement(By.linkText("Forgotten password?")).click();
		//pause 3sec
		Thread.sleep(3000);
	    }
	    @AfterMethod
	    public void quit()
	    {
		//close the browser
		d.quit();
	    }

}
