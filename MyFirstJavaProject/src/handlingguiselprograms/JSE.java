package handlingguiselprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSE {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\HP\\Desktop\\SeleniumSession2\\driver\\chromeDriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.get("https://selenium.obsqurazone.com/form-submit.php");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement firstName = driver.findElement(By.xpath("//*[@id='validationCustom01']"));

		WebElement lastName = driver.findElement(By.xpath("//*[@id='validationCustom02']"));
	
		Thread.sleep(2000);			
		js.executeScript("arguments[0].value='ingrid';", firstName);
		js.executeScript("arguments[0].value='rodri'", lastName);
		 WebElement submitBtn = driver.findElement(By.xpath("//*[@type='submit']"));
			js.executeScript("arguments[0].click();",submitBtn);

		

	}

}
