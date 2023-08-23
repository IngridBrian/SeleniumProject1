package leartning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakemyTrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\HP\\Desktop\\SeleniumSession2\\driver\\chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://www.makemytrip.com/");
		driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
		driver.findElement(By.cssSelector("[class='close'] ")).click();
		driver.navigate().refresh();
		driver.switchTo().defaultContent();
		driver.findElement(By.cssSelector("[class='primaryBtn font24 latoBold widgetSearchBtn '] ")).click();
		driver.findElement(By.cssSelector("[class='bgProperties icon20 overlayCrossIcon '] ")).click();

	}

}
