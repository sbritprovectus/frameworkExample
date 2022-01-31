package org.brit.pages.web;

import static com.codeborne.selenide.Selenide.$;

import lombok.AllArgsConstructor;

public class LoginPage {

    public AllItemsPage login(String userName, String userPass){
        $("#user-name").setValue(userName);
        $("#password").setValue(userPass);
        $("#login-button").click();
        return new AllItemsPage();
    }
}
