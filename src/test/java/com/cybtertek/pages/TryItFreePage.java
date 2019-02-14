package com.cybtertek.pages;

import com.cybtertek.utilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TryItFreePage {

    public TryItFreePage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div//a[@class='btn btn-primary']")
    public WebElement TryItFreeButton;

    @FindBy(xpath = "//div[@class='choose-app-list col-12 col-lg-10 offset-lg-1 mt24 mb96 o_animate_in_children o_visible']")
    public WebElement Applications;

    @FindBy(xpath = "//*[@id=\"wrapwrap\"]/main/div/div[2]/div[1]/div/div[1]/div[3]/label[1]/div/div[2]/span/span")
    public WebElement Manufacturing;

    @FindBy(xpath = "//img[@title='Odoo Website icon']")
    public WebElement Website;

    @FindBy(xpath = "//*[@id=\"wrapwrap\"]/main/div/div[2]/div[1]/div/div[1]/div[3]/label[1]/div/div[2]/span/span")
    public WebElement AppSelected;

    @FindBy(xpath = "//*[@id=\"wrapwrap\"]/main/div/div[2]/div[1]/div/div[2]/div/div/button")
    public WebElement ConfigureButton;

  //  @FindBy(xpath="//button[@class='btn btn-primary']")
   // public WebElement StartNow;

    @FindBy(xpath = "//div[@class='field-name group']//input")
    public WebElement firstName;

    @FindBy(xpath = "//div[@class='field-email group']//input")
    public WebElement inputEmail;

    @FindBy(xpath = "//*[@id=\"company-name\"]")
    public WebElement inputCompanyName;

    @FindBy(xpath="//*[@id=\"phone\"]")
    public WebElement phoneNumber;

    @FindBy(xpath = "//*[@id=\"wrapwrap\"]/main/div/div[2]/div[2]/div/div[2]/form/div[4]/div[1]/div")
    public WebElement Country;

    @FindBy(xpath = "//select[@name='company_size']")
    public WebElement companySize;

    @FindBy(xpath = "//*[@id='wrapwrap']/main/div/div[2]/div[2]/div/div[2]/form/div[4]/div[2]/div" )
    public WebElement language;

    @FindBy(xpath="//select[@name='plan']")
    public WebElement primaryInterest;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement StartNow;

    @FindBy(xpath = "//div[@class='alert alert-warning']")
    public WebElement WarningMessage;

    @FindBy(xpath = "//h6[@class='mt0']")
    public WebElement numOfSelectedApps;

    @FindBy(xpath = "//ul[@class='o_primary_nav']")
    public WebElement menuBar;

    @FindBy(xpath = "//div[@class='alert alert-warning']")
    public WebElement activationMessage;





}
