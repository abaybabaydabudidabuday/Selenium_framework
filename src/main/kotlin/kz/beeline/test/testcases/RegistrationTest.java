package kz.beeline.test.testcases;

import io.qameta.allure.*;
import kz.beeline.test.dataproviders.TestDataProvider;
import kz.beeline.test.interfaces.TestBase;
import kz.beeline.test.pages.HomePage;
import kz.beeline.test.pages.LoginMobilePasswordPage;
import kz.beeline.test.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static kz.beeline.test.utilities.URLConst.*;
@Listeners(kz.beeline.test.listeners.TestListenerImpl.class)
@Epic("Regression tests")
@Feature("Login tests")
public class RegistrationTest extends TestBase {


    @Test(priority = 1,dataProvider = "LoginDataProvider", dataProviderClass = TestDataProvider.class, description = "Valid Registration Scenario with phone, mail and nickname")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Test Description: Registration Test with phone,mail and nickname")
    @Story("Registration story")
    public void test(String number, String password){
        System.out.println(number);

        //Вход на главную страницу beeline.kz с проверкой и нажать кнопку "Войти"
        HomePage homePage = new HomePage(driver);
        homePage.verifyPage();
        homePage.clickLogin();

        //Проверка перехода на страницу Логинизация и нажать кнопку "Как получить пароль?"
        LoginPage loginPage = new LoginPage(driver);
        loginPage.verifyPage();
        loginPage.clickForgotPassword();

        //Проверка перехода на страницу Восстановления пароля, ввести логин и нажать кнопку "отправить"
        LoginMobilePasswordPage mobilePasswordPage = new LoginMobilePasswordPage(driver);
        mobilePasswordPage.setLoginNumber(number);
        mobilePasswordPage.clickSendingPasswordBtn();
        homePage.goToHomePage();

    }
}
