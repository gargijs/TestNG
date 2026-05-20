package testngday3;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class A {
	@Parameters({"name","password"})
	@Test
	void OpenPage(String name , String password)
	{
	    System.out.println(name);
	    System.out.println(password);

	    if(name.isEmpty())
	    {
	        System.out.println("test case pass");
	    }
	}}
