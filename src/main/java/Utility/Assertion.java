package Utility;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Assertion {

	public static void main(String[] args) {
		//hardAssertion();
		softAssertion();
		

	}
	    public static  void hardAssertion(){
	        Assert.assertEquals("pass","pass");
	        System.out.println("This line is executed because assertEquals "
	                + "passed as both the strings are same");
	        Assert.assertNull("assertion");
	        System.out.println("Since the object under assertion"
	                + " is not null, the assertion will fail. "
	                + "This line will not be executed");
	    }
	
	    public static void softAssert(Boolean exp){
	    	SoftAssert softAssert= new SoftAssert();
	        softAssert.assertEquals(arg, arg);
	        System.out.println("We are using Soft assertion in this method ");
	        softAssert.assertAll();
	    }
	    
}
/*
SoftAssert softAssert= new SoftAssert();
softAssert.assertEquals(arg, arg);
System.out.println("We are using Soft assertion in this method,");  
softAssert.assertAll();
*/

