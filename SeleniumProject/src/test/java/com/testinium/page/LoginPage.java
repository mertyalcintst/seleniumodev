package com.testinium.page;

import com.testinium.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPage {

    Methods methods;

    public LoginPage(){
        methods = new Methods();
    }

    public void login(){

        methods.click(By.cssSelector(".menu-top-button.login>a"));
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("login-email"),"mrtylcn2153@gmail.com");
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("login-password"),"J13998375y!");
        methods.waitBySeconds(1);
        methods.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));
        methods.waitBySeconds(1);

        String sonuc = methods.getText(By.cssSelector(".section"));
        Assert.assertEquals("Hesabım", sonuc);

    }

}
