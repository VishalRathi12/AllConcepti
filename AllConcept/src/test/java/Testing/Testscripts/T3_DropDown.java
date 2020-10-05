package Testing.Testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class T3_DropDown {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
//-----------------------------------------------select by index------------------------------------------------		
		
		WebElement drop = driver.findElement(By.cssSelector("select#day"));
		Select s = new Select(drop);
		s.selectByIndex(5);
		
		
		//-----------------------------------------------------Select by value-------------------------------------
		
		
		WebElement drop1 = driver.findElement(By.cssSelector("select#day"));
		Select s1 = new Select(drop);
		s.selectByValue("January");
		
		
		
		//-----------------------------------------------Select by visible text-------------------------------
		
		
		WebElement drop2 = driver.findElement(By.cssSelector("select#day"));
		Select s2 = new Select(drop);
		s.selectByVisibleText("5");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
