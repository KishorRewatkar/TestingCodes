package MyNewSeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myclass {

	public static void main(String[] args) throws InterruptedException {
		
//		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		
//		driver.get("https://www.flipkart.com/");
//		driver.manage().window().maximize();
//		System.out.println("Launched amazon.com");
//		
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile phones");
//		
//		driver.findElement(By.id("nav-search -submit-button")).click();
//		String currenturl=driver.getCurrentUrl();
//		System.out.println("Change  URl-->"+currenturl);
//		
//		driver.quit();
		
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
				
		//input[@id='nav-search-keywords']
		
//		System.out.println("Launched flipkart.com");
		
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
		
//		driver.findElement(By.id("nav-search -submit-button")).click();
//		String currenturl=driver.getCurrentUrl();
//		System.out.println("Change  URl-->"+currenturl);
		WebElement search= driver.findElement(By.xpath(" //body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]"));
		search.sendKeys("hefshine");
		search.sendKeys(Keys.ENTER);
//		search.sendKeys(arg0);
		
		Thread.sleep(5000);
		
		driver.close();
		
		

	}

}
