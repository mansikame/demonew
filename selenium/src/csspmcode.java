import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class csspmcode {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium SetUp\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
         driver.manage().window().maximize();
         driver.get("https://www.facebook.com/");
 
		
         WebElement username=driver.findElement(By.cssSelector("input[id=\"email\"]"));
		 username.sendKeys("mkjh@gmail.com");
		 
		 WebElement pass=driver.findElement(By.cssSelector("input[id=\"pass\"]"));
		 pass.sendKeys("mkjh@gmail.com");
		 
		 WebElement loginbtn=driver.findElement(By.cssSelector("button[id=\"u_0_5_yb\"]"));
	     loginbtn.click();
		
		
		
		
		

	}

}
