package september07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		WebElement link = driver.findElement(By.id("nav-link-accountList"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(link).build().perform();
		
		WebElement category = driver.findElement(By.id("nav-link-shopall"));
		Thread.sleep(2000);
		action.moveToElement(category).build().perform();
		Thread.sleep(2000);
		
		WebElement fireTv = driver.findElement(By.xpath("//*[contains(text(), 'Fire TV Stick')]"));
		
		action.moveToElement(fireTv).build().perform();

	}

}
