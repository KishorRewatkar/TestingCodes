package MyNewSeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewProject {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		String baseUrl = "http://demo.guru99.com/test/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       
        //close Fire fox
        driver.close();String baseUrl1 = "http://demo.guru99.com/test/newtours/";
        String expectedTitle1 = "Welcome: Mercury Tours";
        String actualTitle1 = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl1);

        // get the actual value of the title
        actualTitle1 = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle1.contentEquals(expectedTitle1))
        {
            System.out.println("Test Passed!");     

        } else 
        {
            System.out.println("Test Failed");
        }
        //close chrome
          Thread.sleep(5000);
//        driver.close();
	}
}
