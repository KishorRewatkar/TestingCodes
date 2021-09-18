package MyNewSeleniumProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Demo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\ChromeDriver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");
		
		WebElement clicklink=driver.findElement(By.cssSelector("#cars"));
//		clicklink.click();
//		clicklink=driver.findElement(By.linkText("Edit Customer"));
		Select objSelect = new Select(clicklink);
//		Select objSelect=new Select(driver.findElement(By.tagName("a")));
	    objSelect.selectByVisibleText("Saab");
		WebElement firstEl=objSelect.getFirstSelectedOption();
		System.out.println("firstEl"+firstEl.getText());
		
		List<WebElement> listopt=objSelect.getOptions();
		for (WebElement webElement:listopt)
		{
			System.out.println("optionss"+webElement.getText());
		}
		
		
		Thread.sleep(5000);
		driver.close();
		
	}
}
