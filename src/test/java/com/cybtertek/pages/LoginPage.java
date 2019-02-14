package com.cybtertek.pages;


import com.cybtertek.utilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage (){

        PageFactory.initElements (Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@class='list-group-item'])[2]")
    public WebElement Database;

    @FindBy(id = "login")
    public WebElement Email;

    @FindBy(id = "password")
    public WebElement Password;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement LoginBtn;










}