package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\SeleniumSession2\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
//		driver.navigate().back();
//		driver.navigate().forward();
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();	
		System.out.println(url);
//		String pagesource = driver.getPageSource();
//		System.out.println(pagesource);
//		driver.close();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
//		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		driver.findElement(By.id("ap_email")).sendKeys("7259317597");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("12JesusMary$");
		driver.findElement(By.id("signInSubmit")).click();
		
	}

}
