package CheckBox_Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class CheckBox_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium tutorial\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		
		//1select_checkbox_amongoptions
		WebElement CheckBox1=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[1]/input"));
		CheckBox1.click();
		
		//2.select_checkbox_defaultoption
		WebElement CheckBox2=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/input"));
		boolean Selenium_Selected=CheckBox2.isSelected();
		System.out.println(Selenium_Selected);
		
		//3.Deselect_thecheckbox
		WebElement CheckBox3Selected=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[2]/input"));
		WebElement CheckBox3UnSelected=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[1]/input"));
		if(CheckBox3Selected.isSelected())
		{
			 CheckBox3Selected.click();
			}
		else
		{
			CheckBox3UnSelected.click();
		}
		
		
		//4.Select_Checkbox_Alloptions
		WebElement CheckBox4_Option1=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[1]/input"));
		CheckBox4_Option1.click();
		 
		WebElement CheckBox4_Option2=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[2]/input"));
		CheckBox4_Option2.click();
		
		WebElement CheckBox4_Option3=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[3]/input"));
		CheckBox4_Option3.click();
		 
		WebElement CheckBox4_Option4=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[4]/input"));
		CheckBox4_Option4.click();
		 
		WebElement CheckBox4_Option5=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[5]/input"));
		CheckBox4_Option5.click();  
		
	}
}
