package com.bitrix.utilities;

import com.bitrix.pages.activity_stream.ActivityStreamPage;
import com.bitrix.pages.login_navigation.LoginPage;
import com.bitrix.step_definition.LoginStepDefinitions;

public class Pages {
    private ActivityStreamPage activityStreamPage;
    private LoginPage loginPage;

    public ActivityStreamPage activityStreamPage() {
        if (activityStreamPage == null) {
             activityStreamPage = new ActivityStreamPage();
        }
        return activityStreamPage;
    }

    public LoginPage loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }
}
