package com.testinium.Test;

import com.testinium.driver.BaseTest;
import com.testinium.page.LoginPage;
import com.testinium.page.ProductPage;
import org.junit.Test;
import org.openqa.selenium.By;

public class ProductTest extends BaseTest {
    @Test
    public void productTest(){
        LoginPage loginPage = new LoginPage();
        ProductPage productPage = new ProductPage();

        loginPage.login();
        productPage.selectProduct();
    }

}
