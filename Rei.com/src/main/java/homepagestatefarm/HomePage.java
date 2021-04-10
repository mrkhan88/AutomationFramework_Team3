package homepagestatefarm;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



import static homepagestatefarm.HomePageWebElement.ReturnPolicyButton;

public class HomePage extends WebAPI {

    // Action Method class



    // Find By Annotation: First Approach


    @FindBy(how = How.XPATH, using = ReturnPolicyButton) public WebElement returnPolicy;
    @FindBy(xpath = "body/div[@id='container']/div[1]/footer[1]/div[3]/div[2]/div[1]/div[1]/ul[1]/li[1]/a[1]")
    public WebElement ReturnPolicy;
    @FindBy(xpath = "//body/div[@id='container']/div[1]/footer[1]/div[3]/div[2]/div[1]/div[1]/ul[1]/li[2]/a[1]")
    public WebElement ReturnInstructions;
    @FindBy(xpath = "//a[contains(text(),'Your Online Account')]")
    public WebElement YourOnlineInstructions;
    @FindBy(xpath = "//a[contains(text(),'Purchase Status')]")
    public WebElement PurchaseStatus;
    @FindBy(xpath = "//a[contains(text(),'Shipping Info')]")
    public WebElement ShippingInfo;
    @FindBy(xpath = "//body/div[@id='container']/div[1]/footer[1]/div[3]/div[2]/div[1]/div[1]/ul[1]/li[6]/a[1]")
    public WebElement Membership;
    @FindBy(xpath = "//input[@id='inputGroup']]")
    public WebElement searchBox;
    @FindBy(xpath = "//header/nav[1]") public WebElement Furniture;
    @FindBy(xpath = "//header/nav[1]") public WebElement Outdoor;
    @FindBy(xpath = "//a[@id='DepartmentItem-Bedding & Bath']") public WebElement Bedding;
    @FindBy(xpath = "//a[@id='DepartmentItem-Rugs']") public WebElement Rugs;
    @FindBy(xpath = "//a[@id='DepartmentItem-Décor & Pillows']") public WebElement Pillows;
    @FindBy(xpath = "//a[@id='DepartmentItem-Décor & Pillows']") public WebElement Organization;
    @FindBy(xpath = "//a[@id='DepartmentItem-Décor & Pillows']") public WebElement Lighting;
    @FindBy(xpath = "//a[@id='DepartmentItem-Décor & Pillows']") public WebElement Kitchen;
    @FindBy(xpath = "//a[@id='DepartmentItem-Baby & Kids']") public WebElement Baby;
//    @FindBy(xpath = "//a[@id='DepartmentItem-Baby & Kids']") public WebElement Baby;



    public void clickReturnPolicy(){returnPolicy.click();}

    public void clickTheReturnPolicy(){
        ReturnPolicy.click();
    }

    public void clickTheReturnInstructions(){
        ReturnInstructions.click();
    }

    public void clickTheYourOnlineInstructions(){
        YourOnlineInstructions.click();
    }

    public void clickThePurchaseStatus(){
        PurchaseStatus.click();
    }

    public void clickTheShippingInfo(){
        ShippingInfo.click();
    }

    public void clickTheMembership(){
        Membership.click();
    }

    public void typeOnSearchBox(){
        searchBox.click();
    }

    public void clickOnFurniture(){
        Furniture.click();
    }

    public void clickOnOutdoor(){
        Outdoor.click();
    }

    public void clickOnBedding(){
        Bedding.click();
    }

    public void clickOnRugs(){
        Rugs.click();
    }

    public void clickOnPillows(){
        Pillows.click();
    }

    public void clickOnOrganization(){
        Organization.click();
    }

    public void clickOnLighting(){
        Lighting.click();
    }

    public void clickOnKitchen(){
        Kitchen.click();
    }

    public void clickOnBaby(){
        Baby.click();
    }



}
