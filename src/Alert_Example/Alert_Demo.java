package Alert_Example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Demo {
	public static void main(String[] args)  {
 
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium tutorial\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		//1.Alert box
		WebElement AlertBox=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button"));
		AlertBox.click();
		Alert Toalert=driver.switchTo().alert();
		Toalert.accept();
		
		
		
		//2.Confirm box
		
			//2.1 You pressed OK
			WebElement ConfirmBox=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
			ConfirmBox.click();
			Alert Toconfirm = driver.switchTo().alert();
			Toconfirm.accept();
			
			//2.1 You pressed CANCEL
			WebElement ConfirmBox1=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
			ConfirmBox1.click();
			Alert Toconfirm1 = driver.switchTo().alert();
			Toconfirm1.dismiss();
		
		
		
		//3.Prompt box
			
		WebElement PromptBox=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
		PromptBox.click();
		Alert Toprompt=driver.switchTo().alert();
		Toprompt.sendKeys("Selenium tutorial");
		Toprompt.accept();
		
		//4.Linebreaks in Alert
		WebElement LineBreakBox=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/button"));
		LineBreakBox.click();
		Alert ToLineBreak=driver.switchTo().alert();
		ToLineBreak.accept();
		
		//5.Sweet alert
		WebElement SweetAlertBox=driver.findElement(By.xpath("//*[@id=\"btn\"]"));
		SweetAlertBox.click();
		Alert ToSweetAlert=driver.switchTo().alert();
		ToSweetAlert.accept();
	}
}
		
		
		
		