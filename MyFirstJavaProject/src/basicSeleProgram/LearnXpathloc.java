package basicSeleProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpathloc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\HP\\Desktop\\SeleniumSession2\\driver\\chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.xpath("(//div[@class='inputs'])[1]/input")).sendKeys("obsqura24@gmail.com");
		driver.findElement(By.xpath("(//div[@class='inputs'])[2]/input")).sendKeys("mypassword");
		driver.findElement(By.xpath("//*[@value='Log in']")).click();
		driver.findElement(By.xpath("(//*[@class='list'])[1]/li[4]/a")).click();
		
	    driver.findElement(By.xpath("//*[@class='product-title']//*[contains(text(),'Casual')]")).click();
	    //we are using regular expression xpath here
	    WebElement qtyBox = driver.findElement(By.xpath("//*[contains(@id,'_EnteredQuantity')]"));
	    qtyBox.clear();
	    qtyBox.sendKeys("3");
		driver.findElement(By.xpath("//a[@class='ico-cart']")).click();

	}

}
