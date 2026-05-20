package selday4;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.L;

public class Amazon implements L{

	
		// TODO Auto-generated method stub
		public static void main(String[] args) throws InterruptedException {
		    WebDriver driver = new ChromeDriver();
		  
			driver.get(url);
		    driver.manage().window().maximize();
		    Thread.sleep(3000);

		    Dimension dim = new Dimension(500, 700);
		    driver.manage().window().setSize(dim);

		    //Point p = new Point(400, 400);
		    //driver.manage().window().setPosition(p);
		    Thread.sleep(3000);
		    JavascriptExecutor js=(JavascriptExecutor) driver;
		    js.executeScript("windows.scrollBy,(300,300);");
	}

}
