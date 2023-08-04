package handlinggui;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptAlert {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("Webdriver.geckodriver.driver",
//				"C:\\Users\\HP\\Desktop\\SeleniumSession2\\moz drive 64\\geckodriver.exe");
//
//		WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\HP\\Desktop\\SeleniumSession2\\driver\\chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//javascript alert - no inspect so use this code.
		driver.get("https://selenium.obsqurazone.com/javascript-alert.php");
		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		/**
		 * We can grab text of alert by using getText() method
		 */
		System.out.println(alert.getText());
		/**
		 * We can accept alert by using accept() method
		 */
		alert.accept();
		
	

		/**
		 * Here we are clicking second alert
		 */

	driver.findElement(By.xpath("//*[@class='btn btn-warning']")).click();
		Thread.sleep(2000);
		System.out.println(alert.getText());
		

		/**
		 * dismiss() is used to cancel the alert
		 */
		
		alert.dismiss();
				
		/**
		 * Here we are clicking third alert.
		 */

		
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Thread.sleep(2000);
		System.out.println(alert.getText());
		alert.sendKeys("my name is ingrid");
		alert.accept();
		String actualText= driver.findElement(By.cssSelector("#prompt-demo")).getText();
		System.out.println("actualtext is " + actualText);
	//alert.dismiss();
	
	}

}
