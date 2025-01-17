package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class MoreInfoVisualizerPage {

    public MoreInfoVisualizerPage(){ PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(id = "onetrust-accept-btn-handler")
    private WebElement cookies;
    @FindBy(xpath = "//button[@class='tingle-modal__close']")
    private WebElement popUpWindow;
    @FindBy(id = "main-nav-decoratives")
    private WebElement decorativesSection;
    @FindBy(xpath = "//div[@class='l-plp-aside_content']")
    private WebElement sideBar;
    @FindBy(xpath = "//div[@class='grid-link']//h4[@data-analytics-more-info='Visualizer']")
    private WebElement visualizerElement;
    @FindBy(linkText = "GET STARTED NOW")
    private WebElement getStartedButton;

    public WebElement getPopUpWindow() {return popUpWindow;}
    public WebElement getDecorativesSection() {return decorativesSection;}
    public WebElement getVisualizerElement() {return visualizerElement; }

    public void acceptCookies(){cookies.click(); }
    public void popUpWindowClick(){popUpWindow.click();}
    public void scrollDown(WebElement webelement){
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", webelement);
    }
    public void clickOnDecoratives(){ decorativesSection.click();}
    public void clickOnSideBar(){ sideBar.click();}
    public void visualizerElementClick(){visualizerElement.click();}
    public void getStartedButtonClcik(){getStartedButton.click();}
}
