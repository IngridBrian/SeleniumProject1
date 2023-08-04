package handlinggui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\HP\\Desktop\\SeleniumSession2\\driver\\chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable");
		
		Actions act = new Actions(driver);
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement destination = driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));
		
		act.dragAndDrop(source, destination).build().perform();

		
	}

}
