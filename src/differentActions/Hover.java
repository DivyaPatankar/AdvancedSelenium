package differentActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hover {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		WebElement toElement = driver.findElement(By.xpath("//*[contains(text(), 'Hello. Sign in')]"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(toElement).build().perform();
		
		Thread.sleep(3000);
		WebElement prime = driver.findElement(By.id("nav-link-prime"));
		actions.moveToElement(prime).build().perform();
		
		Thread.sleep(3000);
		WebElement category = driver.findElement(By.id("nav-link-shopall"));
		actions.moveToElement(category).build().perform();
		
		
	}

}
