package selday5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.I;

public class path implements I {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
		  
			driver.get(baseUrl);
		    driver.manage().window().maximize();
		    Thread.sleep(3000);
		    WebElement we = driver.findElement(By.xpath("//h1[contains(text(),'Web form')]"));   //((   xpath=//header[contains(text(),'webform']
		    String name = we.getText(); // get text from website

		    // validation
		    if (name.equals("Web form")) {
		        System.out.println("Test case pass");
		    } else {
		        System.out.println("Test case fail");
		    }

		    driver.findElement(By.xpath("//*[@id='my-text-id']")).sendKeys("Croma"); //how to write xpath=((   //*[@attribute='value']))
		    driver.findElement(By.xpath("//*[@type='submit']")).click();
		   
	}

}
