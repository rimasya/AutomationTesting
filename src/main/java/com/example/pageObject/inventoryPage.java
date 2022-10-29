package com.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class inventoryPage {
    public static WebDriver driver;
    public inventoryPage (WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath ="//select[@class='product_sort_container']" )
    private WebElement product;
    @FindBy(id = "add-to-cart-test.allthethings()-t-shirt-(red)")
    private WebElement shirt1;
    @FindBy(id = "add-to-cart-sauce-labs-onesie")
    private WebElement shirt2;
    @FindBy(css = ".shopping_cart_link")
    private WebElement shoppingchart;
    @FindBy(id = "remove-test.allthethings()-t-shirt-(red)")
    private WebElement removeItem;
    @FindBy(id = "checkout")
    private WebElement checkout;
    @FindBy(id = "first-name")
    private WebElement firstname;
    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement lastname;
    @FindBy(name = "postalCode")
    private WebElement code;
    @FindBy(id = "continue")
    private WebElement continueshop;
    @FindBy(xpath = "//div[@class='summary_subtotal_label']")
    private WebElement itemtotal;
    @FindBy(xpath = "//div[@class='summary_tax_label']")
    private WebElement tax;
    @FindBy(xpath = "//div[@class='summary_total_label']")
    private WebElement total;
    @FindBy(xpath = "//button[@id='finish']")
    private WebElement finish;
    @FindBy(css = ".complete-header")
    private WebElement success;

    public void sortProduct (String sortProduct){
        product.click();
        Select a = new Select(product);
        a.selectByVisibleText(sortProduct);
    }
    public void clickProduct1(){shirt1.click();}
    public void clickProduct2(){shirt2.click();}
    public void ShopChart(){shoppingchart.click();}

    public void RemoveItem(){removeItem.click();}
    public void CheckOut(){checkout.click();}

    public void setFirstname(String user){
        firstname.sendKeys(user);
    }
    public void setLastname(String user){
        lastname.sendKeys(user);
    }
    public void setCode(String user){
        code.sendKeys(user);
    }
    public void Continue(){continueshop.click();}
    public String Itemtotal (){
       return itemtotal.getText();
    }
    public String Tax (){
        return tax.getText();
    }
    public String Total (){
        return total.getText();

    }
    public void FINISH(){finish.click();}
    public String Success (){
        return success.getText();
    }

}