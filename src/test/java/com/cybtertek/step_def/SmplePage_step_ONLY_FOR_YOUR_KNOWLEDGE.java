//package com.cybtertek.step_def;
//
//import com.cybtertek.utilites.ConfigurationReader;
//import com.cybtertek.utilites.Driver;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
///*
//public class SmplePage_step_ONLY_FOR_YOUR_KNOWLEDGE {
//
//// OPTION + ENTER       MAC
//// ALT + ENTER       WINDOWS
//
//    @When("user logs in as a team lead")
//    public void user_logs_in_as_a_team_lead() {
//        System.out.println("I am logging in");
//        System.out.println("email: " + ConfigurationReader.getProperty("leader_email"));
//        System.out.println("password: " + ConfigurationReader.getProperty("leader_password"));
//
//        SignInPage signInPage = new SignInPage();
//        signInPage.email.sendKeys(ConfigurationReader.getProperty("leader_email"));
//        signInPage.password.sendKeys(ConfigurationReader.getProperty("leader_password"));
//        signInPage.signIn.click();
//
//    }
//
//    @Given("user on the login page")
//    public void user_on_the_login_page() {
//        System.out.println("I am opening the login page");
//        // open the login page of the application
//        // url is in the properties file
//        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
//    }
//
//    @Then("homepage should be displayed")
//    public void homepage_should_be_displayed() {
//
//        System.out.println("I can see the home page now!!");
//        // verify the header
//        String expected = "map";
//
//    }
//
//    @Then("the title should be correct")
//    public void the_title_should_be_correct() {
//        System.out.println("Checking title");
//    }
//
//    @When("user logs in as a team member")
//    public void user_logs_in_as_a_team_member() {
//        System.out.println("I am logging in as member");
//
//        SignInPage signInPage = new SignInPage();
//        signInPage.email.sendKeys(ConfigurationReader.getProperty("member_email"));
//        signInPage.password.sendKeys(ConfigurationReader.getProperty("member_password"));
//        signInPage.signIn.click();
//
//    }
//
//    @When("user logs in as a teacher")
//    public void user_logs_in_as_a_teacher() {
//        System.out.println("I am logging in as teacher");
//
//        SignInPage signInPage = new SignInPage();
//        signInPage.email.sendKeys(ConfigurationReader.getProperty("teacher_email"));
//        signInPage.password.sendKeys(ConfigurationReader.getProperty("teacher_password"));
//        signInPage.signIn.click();
//
//    }
//
//
//}
//
//
