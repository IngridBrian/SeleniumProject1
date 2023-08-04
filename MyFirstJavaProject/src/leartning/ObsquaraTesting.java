package leartning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ObsquaraTesting {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\HP\\Desktop\\SeleniumSession2\\driver\\chromeDriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.findElement(By.xpath("//ul[@class='navbar-nav']/li[2]")).click();
		driver.findElement(By.xpath("//input[@id='single-input-field']")).sendKeys("my name is ingrid");
		driver.findElement(By.xpath("//button[@id='button-one']")).click();
		getValue(driver.findElement(By.xpath("//div[@id='message-one']")).getText(),"ingrid");
		

	}

	private static void getValue(String str, String expected) {
		String actualtext = str.split(": ")[1];
		System.out.println(actualtext);
		Assert.assertEquals(actualtext, expected);
		
	}

}
