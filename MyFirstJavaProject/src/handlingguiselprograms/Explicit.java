package handlingguiselprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Desktop\\SeleniumSession2\\driver\\chromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		/*
		 * instead of thread sleep we can use implicit wait and we declare globally so all click and send text evry elements will get 
		 * 3 secs , but if one elements fetched in milisec or 1 sec it swill not wait for 3 sec, it will click, so each elemet 3 sec, and if one elememnt need 4 sec then no such element exception.
		 * if wait is mor than we expect like 5, 6 then we go for explicit wait.
		 * 
		 * if we declr thread.sleep , it will for 3 sec no matter if we click or not. so we wait for remaing secs and waste of time 
		 */
						}

}
