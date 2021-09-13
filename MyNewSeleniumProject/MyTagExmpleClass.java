package MyNewSeleniumProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class MyTagExmpleClass {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
//		WebElement search=driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]"));
//		WebElement search=driver.findElement(By.linkText("HTML Reference"));
		//used for partial link thath means find smallest part of link which you have to search
//		driver.findElement(By.partialLinkText("jQuery")).click();
        List<WebElement> imageLink=driver.findElements(By.tagName("a"));
        System.out.println(""+imageLink.size());
        for(int i=0; i<imageLink.size(); i++)
        {
        	System.out.println(imageLink.get(i).getText());
        }
        
//		search.sendKeys("");
//		search.sendKeys(Keys.c);
//		search.click();
		
		Thread.sleep(5000);
		driver.quit();
	}
}
