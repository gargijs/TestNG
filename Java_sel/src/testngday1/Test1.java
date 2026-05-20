package testngday1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utility.I;

public class Test1 implements I {

	    @Test
	    void OpenBrowser() {
	        WebDriver driver = new ChromeDriver();
	        driver.get(baseUrl);
	        driver.manage().window().maximize();
	    }
	}

