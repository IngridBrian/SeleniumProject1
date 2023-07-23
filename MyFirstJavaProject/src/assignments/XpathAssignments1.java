package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAssignments1 {

	//computers
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\HP\\Desktop\\SeleniumSession2\\driver\\chromeDriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			// tagname[@attribute='value']
			driver.findElement(By.xpath("//a[@class='ico-login']")).click();
			driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("obsqura24@gmail.com");
			driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("mypassword");
			driver.findElement(By.xpath(" //input[@class='button-1 login-button']")).click();
			driver.findElement(By.xpath("(//*[@class='list'])/li[2]/a")).click();
			
			driver.findElement(By.xpath("(//*[@class='sublist'])/li[2]/a")).click();
			driver.findElement(By.xpath("//*[@class='product-title']//*[contains(text(),'14.1-inch')]")).click();
			System.out.println(driver.findElement(By.xpath("//*[@class='product-name']")).getText());
			System.out.println(driver.findElement(By.xpath("//div[@class='product-price']")).getText());
			WebElement qtyBox = driver.findElement(By.xpath("//*[contains(@id,'addtocart_31_EnteredQuantity')]"));
			qtyBox.clear();
			qtyBox.sendKeys("4");

			driver.findElement(By.xpath("//*[contains(@id,'add-to-cart-button-31')]")).click();
		//driver.quit();

	}

}
