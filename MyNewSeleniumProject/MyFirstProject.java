package MyNewSeleniumProject;

import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstProject {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
//		WebElement add=driver.findElement(By.)
		WebElement add=driver.findElement(By.name("First Name:"));
		add.sendKeys("Kishor");
	
			
	    
		
	} 
}
