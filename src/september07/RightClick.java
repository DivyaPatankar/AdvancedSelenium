package september07;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.ie.driver","G:\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("http://newtours.demoaut.com/");
		
		WebElement link = driver.
				findElement(By.linkText("REGISTER"));
		
		Actions action = new Actions(driver);
		
		action.contextClick(link).sendKeys(Keys.ARROW_DOWN).
		sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).
		build().perform();
	}

}
