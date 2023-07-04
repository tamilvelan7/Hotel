package Google.adatin;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Adatin {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "/home/tamil/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		
		
				TakesScreenshot ts = (TakesScreenshot) driver;
				File src =ts.getScreenshotAs(OutputType.FILE);
				File des=new File ("Sucessful//output.png");
				FileUtils.copyFile(src, des);

	
				
				//page 1
				driver.findElement(By.id("username")).sendKeys("Joshva45");
				
				driver.findElement(By.id("password")).sendKeys("Jose9490@*#");
				
				driver.findElement(By.id("login")).click();
				
				
				File src1 =ts.getScreenshotAs(OutputType.FILE);
				File des1=new File ("Sucessful//output1.png");
				FileUtils.copyFile(src1, des1);

				
				//page 2
				
				Select drop1=new Select(driver.findElement(By.id("location")));
				drop1.selectByIndex(4);
				
				Select drop2=new Select(driver.findElement(By.id("room_nos")));
				drop2.selectByIndex(3);
				
				driver.findElement(By.id("datepick_in")).clear();
				driver.findElement(By.id("datepick_in")).sendKeys("04/06/2022");
				
				driver.findElement(By.id("datepick_out")).clear();
				driver.findElement(By.id("datepick_out")).sendKeys("08/06/2022");
				
				Select drop3=new Select(driver.findElement(By.id("adult_room")));
				drop3.selectByIndex(1);
				
				//page 3
				driver.findElement(By.id("Submit")).click();
				
				driver.findElement(By.id("radiobutton_3")).click();
				
				driver.findElement(By.id("continue")).click();
				
				//page 4
				driver.findElement(By.id("first_name")).sendKeys("Joshva");
				driver.findElement(By.id("last_name")).sendKeys("Jose");
				driver.findElement(By.id("address")).sendKeys("14/24,GBSK Building MH Road,Melemaruvathur");
				driver.findElement(By.id("cc_num")).sendKeys("7890123478901234");
				Select drop4 = new Select(driver.findElement(By.id("cc_type")));
				drop4.selectByIndex(1);
				Select drop5=new Select(driver.findElement(By.id("cc_exp_month")));
				drop5.selectByIndex(2);
				Select drop6=new Select(driver.findElement(By.id("cc_exp_year")));
				drop6.selectByIndex(15);
				driver.findElement(By.id("cc_cvv")).sendKeys("4563");
				driver.findElement(By.id("book_now")).click();
				
				
				
				
				
				driver.quit();
			
			
				
			}


			

}

