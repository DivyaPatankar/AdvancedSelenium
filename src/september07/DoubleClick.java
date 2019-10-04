package september07;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","G:\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/tooltip-and-double-click/");
		
		WebElement button = driver.findElement(By.id("doubleClickBtn"));
		
		Actions action = new Actions(driver);
		action.doubleClick(button).build().perform();
		
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)");
		
		WebElement rClick = driver.findElement(By.id("rightClickBtn"));
		
		action.contextClick(rClick).build().perform();
		
		
	}

}
