package september08;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		/*driver.get("http://newtours.demoaut.com");
		
		driver.findElement(By.name("userName")).sendKeys("batman");
		driver.findElement(By.name("password")).sendKeys("batman");
		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.xpath("//input[@name ='tripType' and @value ='oneway']")).click();
		
		WebElement dd = driver.findElement(By.xpath("//select[contains(@name,'passCount')]"));
		Select obj = new Select(dd);
		obj.selectByVisibleText("4");*/
		
		
		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		driver.findElement(By.xpath("//input[starts-with(@id,'user-')]")).sendKeys("Hello , World");
		
		driver.findElement(By.xpath("//*[@text()='ShowMessage']")).click();
		
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		driver.findElement(By.xpath("//input[@name='userName']//following::input[1]")).sendKeys("batman");
		driver.findElement(By.xpath("//input[@name='userName']//following::input[2]")).click();
		
		//driver.findElement(By.xpath("//input[@name='login']//ancestor::td[2]"));
		

	}

}
