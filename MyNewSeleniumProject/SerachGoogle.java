package MyNewSeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

public class SerachGoogle {

	public static void main(String[] args) throws InterruptedException {
		
//		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.google.com/");
//		
////		WebElement search=driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]"));
//		WebElement search=driver.findElement(By.name("q"));
//		search.sendKeys("hefshine");
//		search.sendKeys(Keys.ENTER);
//		
//		Thread.sleep(5000);
//		driver.close();
		
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_links.asp");
		
//		WebElement search=driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]"));
//		WebElement search=driver.findElement(By.linkText("HTML Reference"));
		//used for partial link thath means find smallest part of link which you have to search
		driver.findElement(By.xpath("//body/div[@id='belowtopnav']/div[1]/div[1]/div[2]/a[2]")).click();
        driver.findElement(By.tagName("a"));
//		search.sendKeys("");
//		search.sendKeys(Keys.c);
//		search.click();
		
		Thread.sleep(5000);
		driver.close();
		
	}
}
