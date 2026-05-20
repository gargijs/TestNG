package selday5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
        driver.get("https://automationexercise.com/" );
        driver.manage().window().maximize();
        Thread.sleep(3000);
       // WebElement we = driver.findElement(By.xpath("//h1[contains(text(),'Web form')]"));  
	    //String name = we.getText(); // get text from website
	    String url=driver.getCurrentUrl();
	    if (url.equals("https://automationexercise.com/")) {
	        System.out.println("Test case pass");
	    } else {
	        System.out.println("Test case fail");
	    }
	    driver.findElement(By.xpath("//*[@class='fa fa-lock']")).click();
	
	 WebElement signupText = driver.findElement(By.xpath("//h2[text()='New User Signup!']"));

     if (signupText.isDisplayed()) {
         System.out.println("'New User Signup!' is visible");
     } else {
         System.out.println("'New User Signup!' is not visible");
     }
     driver.findElement(By.name("name")).sendKeys("Gargi");

     driver.findElement(By.xpath("//input[@data-qa='signup-email']"))
             .sendKeys("gargi123@gmail.com");
     driver.findElement(By.xpath("//button[text()='Signup']"))
     .click();

Thread.sleep(3000);

// Close browser
driver.quit();

}}
