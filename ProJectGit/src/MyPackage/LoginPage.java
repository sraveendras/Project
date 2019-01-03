package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		
		//get title
		System.out.println(driver.getTitle());
		
		//refresh Page
		driver.navigate().refresh();
		
		//forward page
		driver.navigate().forward();
		
		//writing the code
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@class='Name']")).clear();
		driver.findElement(By.xpath("//*[@class='Name']")).click();
		driver.findElement(By.xpath("//*[@class='Name']")).sendKeys("Ravikumar");
		
		//close browser
		driver.close();
	}

}
