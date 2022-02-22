package com.testinium.page;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;


    public class ProductPage {
        Methods methods;
        Logger logger = LogManager.getLogger(ProductPage.class);
        Random rand = new Random();

        public ProductPage() {
            methods = new Methods();
        }

        public void selectProduct() {
            methods.sendKeys(By.id("search-input"), "oyuncak");
            methods.waitBySeconds(0);
            methods.click(By.cssSelector(".common-sprite.button-search"));
            methods.waitBySeconds(0);
            methods.scrollWithAction(By.id("faceted-search-group-6"));
            methods.click(By.xpath("//div[@class='product-list']//div[@class='product-cr'][5]//i[@class='fa fa-heart']"));
            methods.click(By.xpath("//div[@class='product-list']//div[@class='product-cr'][6]//i[@class='fa fa-heart']"));
            methods.click(By.xpath("//div[@class='product-list']//div[@class='product-cr'][7]//i[@class='fa fa-heart']"));
            methods.click(By.xpath("//div[@class='product-list']//div[@class='product-cr'][8]//i[@class='fa fa-heart']"));
            methods.waitBySeconds(1);

            methods.click(By.xpath("//a[@class = 'common-sprite' and text() = 'Listelerim']"));

            methods.click(By.linkText("Favorilerim"));
            methods.waitBySeconds(3);
            methods.click(By.cssSelector(".logo-icon"));
            methods.waitBySeconds(2);

            methods.click(By.cssSelector(".lvl1catalog>a"));
            //methods.waitBySeconds(2);
            methods.scrollWithAction(By.cssSelector("#landing-point > div:nth-child(5)"));
            methods.waitBySeconds(2);
            methods.click(By.cssSelector("#landing-point > div:nth-child(4) > a:nth-child(2) > img"));
            methods.waitBySeconds(1);

            methods.click(By.cssSelector("#content > div > div > div.product-filter > div > div.sort > select"));
            methods.waitBySeconds(1);
            methods.selectByText(By.cssSelector(".sort> select"), "Yüksek Oylama");
            methods.waitBySeconds(1);

            methods.click(By.cssSelector("#mainNav > div.nav-content > ul > li.book.has-menu.active > div.lvl2.js-bookCr > ul > li:nth-child(3) > span"));
            methods.waitBySeconds(1);
            methods.click(By.cssSelector("#mainNav > div.nav-content > ul > li.book.has-menu.active > div.lvl2.js-bookCr > ul > li:nth-child(3) > div > div.open-menu-ct.bookAllCategories > div > ul:nth-child(3) > li:nth-child(14) > a"));
            methods.waitBySeconds(2);

            List<WebElement> productList = methods.findElements(By.cssSelector(".cover"));
            int randNum = rand.nextInt(productList.size());
            productList.get(randNum).click();
            methods.waitBySeconds(2);
            methods.scrollWithAction(By.xpath("//*[@id=\'button-cart\']"));
            methods.click(By.xpath("//*[@id=\'button-cart\']"));
            methods.scrollWithAction(By.xpath("//*[@id=\'button-cart\']"));
            methods.click(By.xpath("//*[@id=\'button-cart\']"));


            methods.click(By.xpath("//a[@class = 'common-sprite' and text() = 'Listelerim']"));
            //methods.waitBySeconds(1);
            methods.click(By.linkText("Favorilerim"));
            methods.waitBySeconds(3);
            methods.scrollWithAction(By.cssSelector("#content > div.grid_9 > div.box.no-padding > div.pagination"));
            methods.click(By.xpath("(//*[@data-title='Favorilerimden Sil'])[3]"));
            methods.waitBySeconds(3);


            methods.scrollWithAction(By.cssSelector("body > div.content-bg > div > div.breadcrumb"));
            methods.waitBySeconds(1);
            methods.click(By.cssSelector("#cart > div.heading > div:nth-child(2) > h4"));
            methods.waitBySeconds(1);
            methods.click(By.cssSelector("#js-cart"));
            methods.waitBySeconds(2);
            methods.click(By.cssSelector("#cart_module > div.cart-info > table > tbody > tr > td.quantity > form > input[type=text]:nth-child(1)"));
            methods.sendKeys(By.cssSelector("#cart_module > div.cart-info > table > tbody > tr > td.quantity > form > input[type=text]:nth-child(1)"), "0");
            methods.click(By.cssSelector("#cart_module > div.buttons > div.right > a"));


            methods.click(By.cssSelector("#shipping-tabs > a:nth-child(2)"));
            methods.click(By.cssSelector("#address-firstname-companyname"));
            methods.sendKeys(By.cssSelector("#address-firstname-companyname"), "Mert");
            methods.click(By.cssSelector("#address-lastname-title"));
            methods.sendKeys(By.cssSelector("#address-lastname-title"), "Yalçın");
            methods.click(By.cssSelector("#address-country-id"));
            methods.selectByText(By.cssSelector("#address-country-id"), "Türkiye");
            methods.click(By.cssSelector("#address-zone-id"));
            methods.selectByValue(By.cssSelector("#address-zone-id"), "3354");
            methods.click(By.cssSelector("#address-county-id"));
            methods.selectByValue(By.cssSelector("#address-county-id"), "464");
            methods.click(By.cssSelector("#address-address-text"));
            methods.sendKeys(By.cssSelector("#address-address-text"), "barış caddesi no:14 kat:2 no:4");
            methods.waitBySeconds(2);
            methods.click(By.cssSelector("#address-telephone"));
            methods.sendKeys(By.cssSelector("#address-telephone"), "5412743681");
            methods.click(By.cssSelector("#address-mobile-telephone"));
            methods.sendKeys(By.cssSelector("#address-mobile-telephone"), "5412743681");
            methods.waitBySeconds(2);
            methods.click(By.cssSelector("#button-checkout-continue"));
            methods.waitBySeconds(1);

            methods.click(By.cssSelector("#button-checkout-continue"));
            methods.click(By.cssSelector("#credit-card-owner"));
            methods.waitBySeconds(1);
            methods.sendKeys(By.cssSelector("#credit-card-owner"),"Mert yalçın");
            methods.click(By.cssSelector("#credit_card_number_1"));
            methods.waitBySeconds(1);
            methods.sendKeys(By.cssSelector("#credit_card_number_1"),"1231325465331234");
            methods.click(By.cssSelector("#credit-card-expire-date-month"));
            methods.waitBySeconds(1);
            methods.selectByValue(By.cssSelector("#credit-card-expire-date-month"),"08");
            methods.click(By.cssSelector("#credit-card-expire-date-year"));
            methods.selectByValue(By.cssSelector("#credit-card-expire-date-year"),"2027");
            methods.waitBySeconds(1);
            methods.click(By.cssSelector("#credit-card-security-code"));
            methods.sendKeys(By.cssSelector("#credit-card-security-code"),"123");
            methods.waitBySeconds(2);
            methods.click(By.cssSelector("#button-checkout-continue"));
            methods.waitBySeconds(1);

            String errorText = methods.getText(By.cssSelector("#form-credit-card > div.credit-card-form-content > table > tbody > tr:nth-child(5) > td > span"));
            if(errorText!=null){
                System.out.println(errorText);
                methods.click(By.cssSelector("#logo > a > img"));//Homepage

                methods.scrollWithAction(By.cssSelector("#header-top > div > div.welcome.fl > div.menu.top.login > ul > li > a"));
                methods.clickJS(By.cssSelector("#header-top > div > div.welcome.fl > div.menu.top.login > ul > li > div > ul > li:nth-child(4) > a"));
            } else if (errorText==null){
                System.out.println("Satın alma işlemi gerçekleşiyor.");

            }
            methods.waitBySeconds(3);

            }
    }

