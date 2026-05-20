package testngday2;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import utility.I;
public class TestPage implements I {

    WebDriver driver;
    boolean status;

    @BeforeTest
    void Open_Browser() throws InterruptedException
    {

        driver = new ChromeDriver();
        driver.get(auto_base_url);
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    @Test//(priority = 1)
    void ToVerifyPage()
    {

        status = driver.getPageSource().contains("Features Items");
        System.out.println(status);

        if(status == true)
        {

            System.out.println("Test case pass");
        }
        else
        {

            System.out.println("Test case fail");
        }
    }

    @Test//(priority = 2)
    void Enter_Data()
    {

        driver.findElement(By.xpath("//a[@href='/login']")).click();
    }


	@AfterTest
	void Closepage()
	{
	    System.out.println("Closepage");
	}
}
