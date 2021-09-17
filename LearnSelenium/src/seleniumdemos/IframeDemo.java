package seleniumdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeDemo {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Seleniumsoftware09082021\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	
		WebElement frame=driver.findElement(By.xpath("//*[@id='Single']/iframe"));
		driver.switchTo().frame(frame);
		
		WebElement textbox=driver.findElement(By.xpath("//div[@class='col-xs-6 col-xs-offset-5']//input"));
		textbox.sendKeys("Selenium");
		
		driver.switchTo().defaultContent();

		
		//iframe in frame
		WebElement secondtab=driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]"));
		secondtab.click();
		
		driver.switchTo().frame(1);
		
		driver.switchTo().frame(0);
		
		WebElement text2=driver.findElement(By.xpath("//div[@class='col-xs-6 col-xs-offset-5']//input"));
		text2.sendKeys("webdriver");
		
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[contains(text(),'Single Iframe')]")).click();
		
		driver.close();



	}

}
