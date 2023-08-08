package handlingguiselprograms;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\HP\\Desktop\\SeleniumSession2\\driver\\chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// parent window t-title
		driver.get("https://the-internet.herokuapp.com/windows");
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector(".example a")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentwindow = it.next();
		String childwindow = it.next();
		driver.switchTo().window(childwindow);
		driver.findElement(By.cssSelector(".example h3")).click();
		System.out.println(driver.getTitle());


	}

}
