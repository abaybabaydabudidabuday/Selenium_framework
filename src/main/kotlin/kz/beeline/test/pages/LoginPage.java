package kz.beeline.test.pages;

import kz.beeline.test.interfaces.IPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static kz.beeline.test.utilities.URLConst.LOGIN_PAGE_EXPECTED_URL;

public class LoginPage implements IPage {

    private WebDriver driver;
    @FindBy(css="a.form-label")
    private WebElement forgotPassword;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void clickForgotPassword(){

        forgotPassword.click();

    }


    public void verifyPage() {
        Assert.assertEquals(driver.getCurrentUrl(),LOGIN_PAGE_EXPECTED_URL);

    }
}
