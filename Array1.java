package package1;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

public class Array1 {
	WebDriver d;
	int i;
	@Test
	public void storedays() throws Exception
	{
		/*d.get("https://www.facebook.com/r.php?locale=te_IN");
		Thread.sleep(2000);
		Select dd=new Select(d.findElement(By.id("day")));
		for(i=0;i<31;i++)
		{
		dd.selectByIndex(i);
		int a[]=new int[30];
		int b[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
		
        System.out.println(Arrays.equals(a, b));*/
		// Load web page
				d.get("https://www.facebook.com/r.php?locale=en_GB");
				
				Select dd=new Select(d.findElement(By.id("day")));
				String a1[]= {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
				String a2[]=new String[dd.getOptions().size()];
				for(int i=0;i<dd.getOptions().size();i++)
				{
					dd.selectByIndex(i);
					a2[i]=dd.getFirstSelectedOption().getText();
					//Thread.sleep(1000);
				}
				//Arrays.sort(a2);
				assertTrue(Arrays.equals(a1, a2));
				assertEquals(a1,a2);

		
	    }
	
	@BeforeTest
	public void launch()
	{
		d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		d.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		
	}
	@AfterTest
	public void close()
	{
		d.quit();
	}

}
