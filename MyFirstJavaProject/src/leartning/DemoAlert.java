package leartning;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\HP\\Desktop\\SeleniumSession2\\driver\\chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//javascript alert - no inspect so use this code.
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@class='col']//button[@id='alertButton']")).click();
		Alert alert = driver.switchTo().alert();
	//	Thread.sleep(2000);
	//	System.out.println(alert.getText());
	//	alert.accept();
		driver.findElement(By.xpath("//*[@class='col']//button[@id='timerAlertButton']")).click();
		Thread.sleep(2000);
		System.out.println(alert.getText());
		alert.accept();
		
		
	}

}
