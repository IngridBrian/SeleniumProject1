package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButonAss1 {
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\HP\\Desktop\\SeleniumSession2\\driver\\chromeDriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/index.php");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='navbar-nav'])/li[2]")).click();
		driver.findElement(By.partialLinkText("Radio Button")).click();
		WebElement radioBtn = driver.findElement(By.id("inlineRadio2"));
		System.out.println("Is my RadioBtn selected: " + radioBtn.isSelected());
		radioBtn.click();
		System.out.println("Is my RadioBtn selected: " + radioBtn.isSelected());
		String Str = driver.findElement(By.xpath("(//*[@class='form-check form-check-inline'])[2]/label")).getText();
		System.out.println("Text displayed next to radio btn "+Str);
		driver.findElement(By.xpath("//*[@id='button-one']")).click();
		String actText = driver.findElement(By.xpath("//div[@id='message-one']")).getText();
		System.out.println("text displayed on clicking radio button "+actText);
		if(actText.contains(Str))
		{
			System.out.println("Actual string containg string "+ Str);
		}
		
//		driver.quit();		
//		female=str1
//	    checked= expected
//	    
	}

	
	
}
