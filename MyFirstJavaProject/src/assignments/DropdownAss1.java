package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class DropdownAss1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\HP\\Desktop\\SeleniumSession2\\driver\\chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		/**
		 * xpath syntax 
		 * 
		 * 1) //tagname[@attribute='value']
		 *  
		 * 2) //tagname
		 * 3) (//tagname[@attribute='value'])[1], (//tagname[@attribute='value'])[2]  --- xpath indexing
		 * 
		 * 4) //*[contains(text(),'Text')]
		 * 5) //button[contains(@class,'submit')] - using regular expression
		 * 
		 * 
		 * 
		 */
		 //	tagname[@attribute='value']
			driver.findElement(By.xpath("//a[@class='ico-login']")).click();
			driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("obsqura24@gmail.com");
		//	(//tagname[@attribute='value'])[1], (//tagname[@attribute='value'])[2]  --- xpath indexing
			driver.findElement(By.xpath("(//div[@class='inputs'])[2]/input")).sendKeys("mypassword");
			driver.findElement(By.xpath("//*[@value='Log in']")).click();
			driver.findElement(By.xpath("(//*[@class='list'])[1]/li[4]/a")).click();	
		    driver.findElement(By.xpath("//*[@class='product-title']//*[contains(text(),'Casual')]")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//input[@id='add-to-cart-button-40']")).click();
//		    WebElement text = driver.findElement(By.xpath("//p[@class='content']"));
//		    System.out.println("text is "+ text.getText());
		    driver.findElement(By.xpath("//span[@class='cart-label']")).click();
		    driver.findElement(By.xpath("//*[@value='Go to cart']']")).click();
		    Thread.sleep(2000);
		    WebElement dropdown = driver.findElement(By.xpath("//select[@id='CountryId']"));
		    Thread.sleep(2000);

			Select staticDropdown = new Select(dropdown);
		    Thread.sleep(2000);

			staticDropdown.selectByValue("41");
			Thread.sleep(2000);
			staticDropdown.selectByIndex(3);
			Thread.sleep(2000);
			staticDropdown.selectByVisibleText("Zimbabwe");
		    
		
	}

}
