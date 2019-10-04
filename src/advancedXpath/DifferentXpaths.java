package advancedXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DifferentXpaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
		//AND
		//driver.findElement(By.xpath("//input[@name='userName' and @size='10']")).sendKeys("batman");
		
		//Contains
		//driver.findElement(By.xpath("//input[contains(@name,'userName')]")).sendKeys("batman");
		
		//StartsWith
		//driver.findElement(By.xpath("//input[starts-with(@name,'user')]")).sendKeys("batman");
		
		//Text
		WebElement label = driver.findElement(By.xpath("//*[text()='Password:']"));
		Actions action = new  Actions(driver);
		action.doubleClick(label).build().perform();
		
		//Following
		//driver.findElement(By.xpath("//*[@name='userName']//following::input[1]")).sendKeys("batman");
		
		//Ancestor
		System.out.println(driver.findElement(By.xpath("//*[@name='password']//ancestor::td[2]")).getText());
		
		
	}

}
