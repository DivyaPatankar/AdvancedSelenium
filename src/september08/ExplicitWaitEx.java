package september08;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","G:\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.seleniumeasy.com/test/dynamic-data-loading-demo.html");
		
		driver.findElement(By.id("save")).click();
		
		/*String text = driver.findElement(By.id("loading")).getText();
		System.out.println(text);
		*/
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		boolean status = wait.until(ExpectedConditions.
				textToBePresentInElementLocated(By.id("loading"), "First Name"));
		
		if(status) {
			String text = driver.findElement(By.id("loading")).getText();
			System.out.println(text);
		}
		
	}

}
