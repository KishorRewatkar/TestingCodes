package MyNewSeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class RegistrationScripts {

	public static void main(String[] args) throws InterruptedException {
		//This Project Automation Testing Input form with validations
		System.setProperty("webdriver.chrome.driver", "D:\\\\ChromeDriver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");
		driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/div/input")).sendKeys("Kishor");
		driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[2]/div/div/input")).sendKeys("Rewatkar");
		driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[3]/div/div/input")).sendKeys("KishorRewatkar@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[4]/div/div/input")).sendKeys("9970627036");
		driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[5]/div/div/input")).sendKeys("Sitaburdi nagpur");
		driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[6]/div/div/input")).sendKeys("Nagpur");
		
		//cheak point
		Select list=new Select(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[7]/div/div/select")));
		list.selectByVisibleText("California");
		//
		driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[8]/div/div/input")).sendKeys("4012");
		
		driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[9]/div/div/input")).sendKeys("www.kishorrewatkarresume.web.app");
		//cheak point
		driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[10]/div/div[1]/label/input")).click();
	
		driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[11]/div/div/textarea")).sendKeys("This is done by automation selenium testing");
		
		driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[13]/div/button")).click();

         
//		driver.findElement(By.xpath("//*[@id=\"get-input\"]/button")).click();
//		driver.findElement(By.xpath("//*[@id=\"sum1\"]")).sendKeys("2");
//		driver.findElement(By.xpath("//*[@id=\"sum2\"]")).sendKeys("1");
//		driver.findElement(By.xpath("//*[@id=\"gettotal\"]/button")).click();
		
		Thread.sleep(10000);
		driver.close();
         
        
		

		
		
	}
}
