package kz.beeline.test.pages;

import kz.beeline.test.interfaces.IPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static kz.beeline.test.utilities.URLConst.LOGIN_MOBILE_PASSWORD_PAGE_EXPECTED_URL;

public class LoginMobilePasswordPage implements IPage {

    private WebDriver driver;
    @FindBy(css="input#Login")
    private WebElement loginET;

    @FindBy(xpath = "//div[@class=\"form-cell\"]")
    private WebElement submitBtn;

    public LoginMobilePasswordPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void setLoginNumber(String number){
        loginET.sendKeys(number);

    }

    public void clickSendingPasswordBtn(){
        submitBtn.click();
    }

    public void verifyPage(){
        Assert.assertEquals(driver.getCurrentUrl(),LOGIN_MOBILE_PASSWORD_PAGE_EXPECTED_URL);
    }


}
