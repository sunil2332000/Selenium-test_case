package Window_Example;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Demo {
	public static void main(String[] args)  {

	// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "D:\\selenium tutorial\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.leafground.com/pages/Window.html");
	
	//1.Change_SwitchControl_NewWindow
	String Parentwindow=driver.getWindowHandle();
	
	WebElement FirstButton=driver.findElement(By.xpath("//*[@id=\"home\"]"));
	FirstButton.click();
	
	Set<String> Handles =driver.getWindowHandles();
	for (String NewWindow : Handles) {
		driver.switchTo().window(NewWindow);
		}
			//1.1Done_AnyOperations_in_UI_COMPONENTS
			WebElement EditBox=driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a"));
			EditBox.click();
	
			driver.close();
			driver.switchTo().window(Parentwindow);
	
	//2.Find_Numberof_OpenedWindows
	WebElement MultipleWindow=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
	MultipleWindow.click();
	
	int Size_Of_Window=driver.getWindowHandles().size();
	System.out.println("No. of Windows Opened:"+Size_Of_Window);
	
	//3.Closing All Windows except parentwindow
	WebElement Dont_Close_me=driver.findElement(By.xpath("//*[@id=\"color\"]"));
	Dont_Close_me.click();
	
	//WebElement Waitin_Seconds=driver.findElement(By.id("color"));
	//driver.wait(5000);
	//Dont_Close_me.click();
	
	
	Set<String> All_Windows=driver.getWindowHandles();
	
	for (String ChildWindows : All_Windows) {
		
		if (!ChildWindows.equals(Parentwindow)) {
			
			driver.switchTo().window(ChildWindows);
			
			driver.close();
			
		}
	}
	
	//4.Wait for open new window
	driver.switchTo().window(Parentwindow);
	WebElement Waitin_Seconds=driver.findElement(By.id("color"));
	synchronized (driver) {
	try {
		driver.wait(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Waitin_Seconds.click();
	
	}
	driver.quit();
	}
}