package com.bitrix.pages.activity_stream;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActivityStreamPage {

    @FindBy(id = "pagetitle")
    public WebElement pageHeader;

    public String getPageHeader(){

        return pageHeader.getText();
    }

}
