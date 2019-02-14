package com.cybtertek.pages;


import com.cybtertek.utilites.Driver;
import org.openqa.selenium.support.PageFactory;

public class ImportPage {

    public ImportPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

}
