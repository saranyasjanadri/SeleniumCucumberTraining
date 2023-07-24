package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//Instead of importing each and everything we can use like this
//import io.cucumber.java.en.*;


public class LoginSteps
{
	@Given ("user is on login page")
	public void verifyLoginPage()
	{
		System.out.println("Inside Step-User is on login page");
	}
	
    @When ("user enters username and password")
    public void EnterDetails()
    {
    	System.out.println("Inside Step-user enters username and password");
    }
    
    @And ("clicks on login button")
    public void ClickingLogin()
    {
    	System.out.println("Inside Step-clicks on login button");
    }
    
    
    @Then ("user is navigated to the home page")
    public void Navigation()
    {
    	System.out.println("Inside Step-user is navigated to the home page");
    }

}
