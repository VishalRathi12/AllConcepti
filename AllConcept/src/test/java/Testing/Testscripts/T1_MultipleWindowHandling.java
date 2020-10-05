package Testing.Testscripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class T1_MultipleWindowHandling {

	public static void main(String[] args) {
		
	
	
	System.setProperty("webdriver.chrome.driver","\"C:\\Users\\PC\\Downloads\\ChromeSetup.exe\"");
    ChromeDriver driver = new ChromeDriver();
    driver.get("https://youtube.com/");
	
    
    WebElement video = driver.findElement(By.xpath("video-title"));
    
    Actions ac = new Actions(driver);
   ac.keyDown(Keys.CONTROL).click(video).keyUp(Keys.CONTROL).build().perform();
    
   String CurrentfocusWindow = driver.getWindowHandle();//here we get the all opne windoiw
   Set<String> allWindow = driver.getWindowHandles();//then all window get store inside the Set(which iis of the string type)
   
   int window = 0;//take integer window will be 0
   
   for(String s : allWindow)//make for loop here condoiton is string s = storing all winodow
   {
	   window = window +1;//increase the value of the window by 1
   	if(window == 3)// Iski wajah se ye sirf 3rd wali video hi kholega
   	{
   	driver.switchTo().window(s);// here we switch the window(s): value of the s get changing bu loop
   	break;//if that condition is getting filled then - it may get to out of the loop 
   }
   }
   
	//-------------------------------------------------------------------------------------------------------
	
	
   String CurrentfocusWindow1 = driver.getWindowHandle();
   Set<String> allWindow1 = driver.getWindowHandles();
	
  String ExpectedWindowURL = "www.mridul.com";
   
   for(String s : allWindow)
   {
	 
	   driver.switchTo().window(s);
   	if(driver.getCurrentUrl().equals(ExpectedWindowURL))// Ye Expected URL wali window kholega
   	{
   	
   	break;
   }
   }
	
	


//-----------------------------------------------------------------------------------------------------------------
	
	
	
	 ac.keyDown(Keys.CONTROL).click(video).keyUp(Keys.CONTROL).build().perform();
     
     String CurrentfocusWindow2 = driver.getWindowHandle();
     Set<String> allWindow2 = driver.getWindowHandles();
		
     for(String s : allWindow)
     {
  	 
  	   driver.switchTo().window(s);//it moved to last opened window
     	
     }
		
		//agar fir ek dum se first window par move Kar dega
     
     driver.switchTo().window(CurrentfocusWindow);
		

	
	}	
	
}
