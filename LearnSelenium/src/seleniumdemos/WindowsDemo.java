package seleniumdemos;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsDemo {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Seleniumsoftware09082021\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		
		System.out.println("The title of main window is: "+driver.getTitle());
		
		WebElement tabwindow=driver.findElement(By.xpath("//div[@id='Tabbed']//button[@class='btn btn-info'][contains(text(),'click')]"));
		tabwindow.click();
			
			
		Set<String>windowIds=driver.getWindowHandles();
									//set is interface
							//driver.getwindowhandles will return setof strings.
							//we will hold the information in set.
							//it will hold the windows opened by selenium
							//java.util
							//u need to iterate the set
							//iterator is interface

		Iterator<String>iter=windowIds.iterator();
								//u need to iterate over the ids

							//u need to find where my main and child window is

		String mainWindow = iter.next();
		String childWindow= iter.next();
							

		driver.switchTo().window(childWindow);
		
		System.out.println("The title of child window is: "+driver.getTitle());
		Thread.sleep(3000);
		
		//driver.close();
		
		driver.switchTo().window(mainWindow);
		
		Thread.sleep(3000);
		
		System.out.println("The title of main window is: "+driver.getTitle());
		
		driver.quit();

	}

}
