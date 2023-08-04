package handlinggui;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\HP\\Desktop\\SeleniumSession2\\driver\\chromeDriver.exe");

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.get("https://www.amazon.ca/");
		 
		      TakesScreenshot scrshot = (TakesScreenshot)driver;
		      File srcfile=scrshot.getScreenshotAs(OutputType.FILE);
		      
		      File destfile = new File("C:\\Users\\HP\\git\\SeleniumProject1\\MyFirstJavaProject\\amzonscreenshot.png");
		      
		      FileUtils.copyFile(srcfile, destfile);
		      
		      driver.quit();
		     
	}}