package loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class loginsaucedemo {
	
          @Test
         public void login() 
         {
	    	 System.setProperty("webdriver.chrome.driver","D:\\New folder\\myproject\\binary\\chromedriver.exe");
	         WebDriver driver=new ChromeDriver();
	    	 driver.get("https://www.saucedemo.com/");
	    	 WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
	         WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
	         WebElement loginbutton=driver.findElement(By.xpath("//input[@id='login-button']"));
	         username.sendKeys("standard_user");
	         password.sendKeys("secret_sauce");
	         loginbutton.click();

        	 
        	 String ExpURL="https://www.saucedemo.com/inventory.html";
        	 String ActURL=driver.getCurrentUrl();
        	 Assert.assertEquals(ActURL, ExpURL);
        	 
        	 
        	         }	
	
	
	
	
	
	

}
