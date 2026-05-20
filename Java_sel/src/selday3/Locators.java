package selday3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html" );
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.id("my-text-id")).sendKeys("Ankit");
        driver.findElement(By.name("my-password")).sendKeys("123456");
        driver.findElement(By.linkText("Return to index")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        
        Select sel=new Select(driver.findElement(By.name("my-select")));
        sel.selectByVisibleText("Two");
	}

}
