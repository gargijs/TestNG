package selday2;

import org.openqa.selenium.chrome.ChromeDriver;

public class navfun {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  ChromeDriver driver = new ChromeDriver();
	        driver.navigate().to("https://www.cromacampus.com/");
	        driver.manage().window().maximize();
	        Thread.sleep(3000);
	        driver.navigate().back();
	        Thread.sleep(3000);
	        driver.navigate().forward();
	        driver.navigate().refresh();


	}

}