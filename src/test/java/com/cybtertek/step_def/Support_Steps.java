package com.cybtertek.step_def;

import com.cybtertek.utilites.Driver;
import org.openqa.selenium.support.PageFactory;

public class Support_Steps {

    public Support_Steps(){

        PageFactory.initElements(Driver.getDriver(), this);
    }








}
