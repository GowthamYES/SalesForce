package testCode1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Email {

	public static void main(String[] args) throws InterruptedException  {
		//to set and download the browser
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver ();
		// get to the url 
		driver.get("https://login.salesforce.com/");
		//for maximazing the windows tab
		driver.manage().window().maximize();
		//to hold the page within the duration of time without escapeing the element from the select click(sometime elements 
		//it may miss due to long time so this keyword hold the page for an time then it may easy to select the element) 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//login process
		driver.findElement(By.id("username")).sendKeys("ramkumar.ramaiah@testleaf.com ");
		driver.findElement(By.id("password")).sendKeys("Password@123");
		driver.findElement(By.id("Login")).click();
		
		Thread.sleep(4000);
		//app manager
driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
//Thread.sleep(4000);
driver.findElement(By.xpath("//button[text()='View All'][@class='slds-button']")).click();
//Thread.sleep(4000);
	//to click the sales button
driver.findElement(By.xpath("//p[contains(text(),'Manage your sales process ')]")).click();
	Thread.sleep(3000);
	//account button
	WebElement accEle = driver.findElement(By.xpath("//span[text()='Accounts']"));
	driver.executeScript("arguments[0].click();",accEle );
	//new element
		driver.findElement(By.xpath("//div[text()='New']")).click() ;
		//send keys for the first name   //the xpath is elder to younger cosine xpath
       driver.findElement(By.xpath("//label[text()='Account Name']/following::input[1]")).sendKeys("Gowtham");
		
		driver.findElement(By.xpath("//label[text()='Rating']/following::button[1]")).click();
	//driver.findElement(By.xpath("//span[text()='--None--']/following::span[1]")).click();
		driver.findElement(By.xpath("//span[text()='Warm']")).click();
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		Thread.sleep(12000);
		
		
		
		
		
		
		
		
		
	}

}

