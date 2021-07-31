package Radio_Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium tutorial\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/radio.html");
		
		//1.RadioButton_simply_Selection
		
		WebElement RadioButton1=driver.findElement(By.id("yes"));
		RadioButton1.click();
		
		//2.Find_Default_Selected_RadioButton
		
		WebElement Unchecked=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label[2]/input"));
		boolean Status1=Unchecked.isSelected();
		System.out.println(Status1);
		
		WebElement Checked=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label[3]/input"));
		boolean Status2=Checked.isSelected();
		System.out.println(Status2);
		
		//3.RadioButton_Selection
		WebElement RadioButton3=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input[2]"));
		RadioButton3.click();
		

	}

}
