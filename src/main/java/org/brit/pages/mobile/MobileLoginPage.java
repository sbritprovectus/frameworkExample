package org.brit.pages.mobile;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MobileLoginPage extends MobileBasePage {

    private final SelenideElement userNameField = $(MobileBy.AccessibilityId("test-Username"));
    private final SelenideElement passwordField = $(MobileBy.AccessibilityId("test-Password"));
    private final SelenideElement loginButton = $(MobileBy.AccessibilityId("test-LOGIN"));

    public MobileAllItemsPage login(String userName, String userPass) {
        userNameField
                .shouldBe(Condition.visible)
                .setValue(userName);
        passwordField.setValue(userPass);
        loginButton.click();
        sleep(2000);
        return new MobileAllItemsPage();
    }
}
