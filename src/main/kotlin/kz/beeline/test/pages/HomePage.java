package kz.beeline.test.pages;

import io.qameta.allure.Step;
import kz.beeline.test.interfaces.IPage;
import kz.beeline.test.utilities.JavaUtilResources;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static kz.beeline.test.utilities.URLConst.HOME_PAGE_EXPECTED_URL;

public class HomePage implements IPage {
    private WebDriver driver;
    @FindBy(className="menu-cabinet-box")
    private WebElement login;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void clickLogin(){

        login.click();

    }
    @Step("Verify Page - Home page is beeline.kz")
    public void verifyPage(){
        Assert.assertEquals(driver.getCurrentUrl(), HOME_PAGE_EXPECTED_URL);
    }

    @Step("goToHomePage - beeline.kz URL")
    public void goToHomePage(){
        driver.get(HOME_PAGE_EXPECTED_URL);
    }

}
