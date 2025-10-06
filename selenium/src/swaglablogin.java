import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class swaglablogin {

	public static void main(String[] args)
	{
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium SetUp\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
         driver.manage().window().maximize();
         driver.get("https://www.saucedemo.com/v1/");
		
		 WebElement username=driver.findElement(By.id("user-name"));
		 username.sendKeys("standard_user");
		
		 WebElement password=driver.findElement(By.id("password"));
		 password.sendKeys("secret_sauce");
		
		WebElement loginbtn=driver.findElement(By.id("login-button"));
		loginbtn.click();
		

	}

}
