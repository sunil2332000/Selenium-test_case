package Frame_Example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Frame_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium tutorial\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		
		//1.Click_the_Button in frame and get_text from frame
		driver.switchTo().frame(0);
		WebElement Button1=driver.findElement(By.xpath("//*[@id=\"Click\"]"));
		Button1.click();
		
		String text=driver.findElement(By.xpath("//*[@id=\"Click\"]")).getText();
		System.out.println("The Default text is:"+text);
		
		
		//2.click_the_Button in Nested frame
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement Button2=driver.findElement(By.xpath("//*[@id=\"Click1\"]"));
		Button2.click();
		
		//3.Find the No.of frames
		driver.switchTo().defaultContent();
		List<WebElement> TotalFrame=driver.findElements(By.tagName("iframe"));
		int Framesize=TotalFrame.size();
		System.out.println("Number of Frames:"+Framesize);
		
		
		
	}

}
