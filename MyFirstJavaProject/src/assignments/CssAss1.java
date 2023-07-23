package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssAss1 {

	public static void main(String[] args) {


		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\HP\\Desktop\\SeleniumSession2\\driver\\chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.cssSelector(".ico-login")).click();
		driver.findElement(By.cssSelector("#Email")).sendKeys("obsqura24@gmail.com");
		driver.findElement(By.cssSelector("#Password")).sendKeys("mypassword");
		driver.findElement(By.cssSelector("input[class='button-1 login-button']")).click();
		driver.findElement(By.cssSelector("ul[class='top-menu'] li:nth-child(5)")).click();
		driver.findElement(By.cssSelector("[class='list'] li:nth-child(5)a")).click();
		driver.findElement(By.cssSelector("a[title*='3rd Album'] img")).click();
		
		
	}

}
