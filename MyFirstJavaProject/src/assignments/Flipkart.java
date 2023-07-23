package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Desktop\\SeleniumSession2\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		System.out.println("title is: " + driver.getTitle());
		System.out.println("current url is:" + driver.getCurrentUrl());
		System.out.println("getPageSource is " + driver.getPageSource());
//		driver.findElement(By.linkText("Login")).click();
//		driver.findElement(By.className("VJZDxU")).sendKeys("7259317597");
		driver.findElement(By.className("_2doB4z")).click();
		Thread.sleep(2000);
		//top offers
		driver.findElement(By.className("_396cs4")).click();
		Thread.sleep(2000);
		//search bar
		driver.findElement(By.name("q")).sendKeys("oneplus earbuds");
		//Search button
		driver.findElement(By.className("L0Z3Pu")).click();
	
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
	
		
	}
	
}
