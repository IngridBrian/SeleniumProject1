package leartning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Desktop\\SeleniumSession2\\driver\\chromeDriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/progress-bar");
		driver.findElement(By.xpath("//*[@id='startStopButton']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='resetButton']")));
//		String text = driver.findElement(By.xpath("//*[@id='resetButton']")).getText();
//		System.out.println(text);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='resetButton']")));
		




	}

}
