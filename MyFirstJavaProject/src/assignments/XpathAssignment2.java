package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAssignment2 {
	// books
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		// tagname[@attribute='value']
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("obsqura24@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("mypassword");
		driver.findElement(By.xpath(" //input[@class='button-1 login-button']")).click();
		driver.findElement(By.xpath("(//ul[@class='list'])[1]/li[1]/a")).click();
		driver.findElement(By.xpath("(//h2[@class='product-title'])[6]/a")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='stock']/span[2]")).getText());
		driver.findElement(By.xpath("//div[@class='email-a-friend']")).click();
		
	}
}
