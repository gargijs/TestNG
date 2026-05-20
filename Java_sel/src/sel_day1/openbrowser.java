package sel_day1;

import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.edge.EdgeDriver; 
import org.openqa.selenium.firefox.FirefoxDriver; 
public class openbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//ChromeDriver driver=new ChromeDriver();//openbrowser
		//FirefoxDriver driver=new FirefoxDriver();
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		String title=driver.getTitle();//for title
		System.out.println(title);
		String url=driver.getCurrentUrl();//for url
		System.out.println(url);
		
		//String code=driver.getPageSource();
		//System.out.println(code);
		
		//driver.close();
	}

}
