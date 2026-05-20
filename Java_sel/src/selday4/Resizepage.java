package selday4;
import utility.I;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Resizepage  implements I{


		// TODO Auto-generated method stub

		public static void main(String[] args) throws InterruptedException {
		    WebDriver driver = new ChromeDriver();
		  
			driver.get(baseUrl);
		    driver.manage().window().maximize();
		    Thread.sleep(3000);

		    Dimension dim = new Dimension(500, 700);
		    driver.manage().window().setSize(dim);

		    Point p = new Point(400, 400);
		    driver.manage().window().setPosition(p);
		    Thread.sleep(3000);
		    JavascriptExecutor js=(JavascriptExecutor) driver;
		    js.executeScript("windows.scrollBy,(0,300);");
	}

}
