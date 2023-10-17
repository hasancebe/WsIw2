package stepdefinitions;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import pages.BasePage;
import pages.LoginPage;
import utilities.ConfigReader;
import  utilities.Driver;
import utilities.ReusableMethods;

import static utilities.Driver.closeDriver;
import static utilities.Driver.quitDriver;

public  class Hooks  {
@Before(order=0)
    public static void open_website(){

        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));
    }



    public static void login_website(){
        BasePage basePage=new BasePage();
        LoginPage loginPage=new LoginPage();
        basePage.login_button.click();
        loginPage.discord_login_button.click();
        ReusableMethods.wait(4);
        loginPage.discord_emailbox.click();
        loginPage.discord_emailbox.sendKeys(ConfigReader.getProperty("ValidUserEmail"));
        loginPage.discord_passwordbox.click();
        loginPage.discord_passwordbox.sendKeys(ConfigReader.getProperty("ValidUserPassword"));
        ReusableMethods.wait(2);
        loginPage.discordPageLoginButton.click();
        ReusableMethods.wait(3);
        loginPage.discord_authorize_button.click();


    }

    @After
    public static void close(){
        closeDriver();
}
    @AfterAll
    public static void teardown() {
      quitDriver();    }

}
