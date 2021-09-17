package seleniumdemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyRegister {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Seleniumsoftware09082021\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='radiooptions' and @value='FeMale']")).click();
		
		WebElement year=driver.findElement(By.xpath("//*[@placeholder='Year']"));
		Select yr=new Select(year);
		List<WebElement>yearcount=yr.getOptions();
		System.out.println(yearcount.size());
		
		for(int i=0;i<yearcount.size();i++)
		{
			System.out.println(yearcount.get(i).getText()
			
		}
		yr.selectByIndex(5);
		
	}

}
