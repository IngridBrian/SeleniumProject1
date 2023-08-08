package leartning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQaJSE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\HP\\Desktop\\SeleniumSession2\\driver\\chromeDriver.exe");

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://demoqa.com/text-box");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement FirstN = driver.findElement(By.cssSelector("#userName"));
		js.executeScript("arguments[0].value='ingrid';", FirstN);
		WebElement email = driver.findElement(By.cssSelector("#userEmail"));
		js.executeScript("arguments[0].value='ingridqa1@gmail.com';", email);
		WebElement curentaddress = driver.findElement(By.cssSelector("#currentAddress"));
		js.executeScript("arguments[0].value='73 block, carmel cottage kochi';", curentaddress);
		WebElement permanentaddress = driver.findElement(By.cssSelector("#permanentAddress"));
		js.executeScript("arguments[0].value='rodrigues villa kochi';", permanentaddress);
		WebElement submtbtn = driver.findElement(By.cssSelector("#submit"));
		js.executeScript("arguments[0].click()", submtbtn);



	}

}
