package differentActions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Clicks {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/tooltip-and-double-click/");
		
		WebElement button = driver.findElement(By.id("doubleClickBtn"));
		
		Actions action = new Actions(driver);
		action.doubleClick(button).build().perform();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		Thread.sleep(3000);
		WebElement button1 = driver.findElement(By.id("rightClickBtn"));
		
		action.contextClick(button1).build().perform();
		
		driver.get("http://newtours.demoaut.com/");
		
		WebElement textBox = driver.findElement(By.name("userName"));
		
		action.contextClick(textBox).moveByOffset(5,30).click().build().perform();

	}

}
