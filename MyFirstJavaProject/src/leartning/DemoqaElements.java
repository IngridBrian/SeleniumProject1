package leartning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoqaElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Desktop\\SeleniumSession2\\driver\\chromeDriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://demoqa.com/");
//		Thread.sleep(2000);
//		driver.
//		driver.findElement(By.xpath("//div[@class='category-cards']/div[1]")).click();
		driver.get("https://demoqa.com/elements");
		driver.findElement(By.xpath("//*[@id='item-0']")).click();
		Actions act= new Actions(driver);
		WebElement fullname = driver.findElement(By.xpath("//*[@id='userName']"));
		//act.moveToElement(fullname).click().keyDown(Keys.SHIFT).build().perform();
		//driver.quit();
		fullname.sendKeys("ingrid");

		
	}

}
