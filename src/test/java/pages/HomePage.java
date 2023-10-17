package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);}
    @FindBy(xpath="/html/body/div/div/form/div/button/span")
    public WebElement magicWand_text;
    @FindBy(id="prompt")
    public WebElement searchbox;
    @FindBy(xpath="/html/body/div/div/form/div/div/button/svg")
    public WebElement searchbox_submit;
    @FindBy(xpath="/html/body/div/header/div[2]/nav/ul/li[1]/a")
    public WebElement home_button;
    @FindBy(xpath="/html/body/div/header/div[2]/nav/ul/li[2]/a")
    public WebElement profile_button;
    @FindBy(xpath="/html/body/div/header/div[2]/nav/ul/li[3]/a")
    public WebElement history_button;
    @FindBy(xpath="/html/body/div/header/div[2]/nav/ul/li[4]/a")
    public WebElement settings_button;
    @FindBy(xpath="/html/body/div/header/div[2]/nav/ul/li[5]/button")
    public WebElement logout_button;

    //gobackhome button in profile page
@FindBy (xpath="/html/body/div/div[1]/a/div")
    public WebElement goBackHome_button;






}
