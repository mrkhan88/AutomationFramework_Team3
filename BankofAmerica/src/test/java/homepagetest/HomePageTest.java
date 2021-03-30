package homepagetest;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import statefarm.Pages.HomePage;



public class HomePageTest extends WebAPI {
    // Test class

    //instance of HomepageClass
    HomePage homePage;


    @BeforeMethod
    public void getInit() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }


   @Test
    public void aboutUsTest() throws InterruptedException {
        //homePage= PageFactory.initElements(driver,HomePage.class);
       homePage.clickAboutUS();
       sleepFor(3);
   }

    @Test
    //Make sure the banner closes or else we cant click on careers
    public void closeThePopUpBanner(){
        homePage.closePopUp();
    }


    @Test
    //find career tab on homepage
    public void searchCareerTest() throws InterruptedException {
        homePage.closePopUp();
        homePage.clickCareer();
        Thread.sleep(1000);
        //waitUntilClickAble(By.cssSelector("#footer_bofa_careers"));
        String expectedText = "Bank of America Careers Site - Apply at Bank of America";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
        //Thread.sleep(1000);
        //driver.close();
    }

    @Test
    //close cookies and clear the location
    public void careerCityClearInput() throws InterruptedException {
        homePage.closePopUp();
        homePage.clickCareer();
        //Thread.sleep(1000);
        homePage.CloseCookies();
        driver.findElement(By.cssSelector("body.aem-wrap--mainpage div.root.parsys:nth-child(2) div.aem-wrap--columncontrol:nth-child(1) div.row.row--full-width div.col.col--span-1-1 div.aem-wrap--masthead.section div.homepage-masthead.js-homepage-masthead div.homepage-masthead__search-bar.js-search-bar div.search-bar__location.js-selector-parent div.location-selector.js-location-selector.instanced div.location-selector__dropdown.js-location-dropdown > input.dropdown__input.js-search-field.t-track-location-selector")).click();
        clearInput("body.aem-wrap--mainpage div.root.parsys:nth-child(2) div.aem-wrap--columncontrol:nth-child(1) div.row.row--full-width div.col.col--span-1-1 div.aem-wrap--masthead.section div.homepage-masthead.js-homepage-masthead div.homepage-masthead__search-bar.js-search-bar div.search-bar__location.js-selector-parent div.location-selector.js-location-selector.instanced div.location-selector__dropdown.js-location-dropdown > input.dropdown__input.js-search-field.t-track-location-selector");
    }

    @Test
    public void returnToHomePage1() throws InterruptedException {
        homePage.closePopUp();
        homePage.clickCareer();
        homePage.CloseCookies();
        homePage.returnToHomepage();
        Thread.sleep(10000);
        String expectedText = "Bank of America - Banking, Credit Cards, Loans and Merrill Investing";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    @Test
    //change the city to New York
    public void careerChangeCity() throws InterruptedException {
        homePage.closePopUp();
        homePage.clickCareer();
        //Thread.sleep(1000);
        homePage.CloseCookies();
        driver.findElement(By.cssSelector("body.aem-wrap--mainpage div.root.parsys:nth-child(2) div.aem-wrap--columncontrol:nth-child(1) div.row.row--full-width div.col.col--span-1-1 div.aem-wrap--masthead.section div.homepage-masthead.js-homepage-masthead div.homepage-masthead__search-bar.js-search-bar div.search-bar__location.js-selector-parent div.location-selector.js-location-selector.instanced div.location-selector__dropdown.js-location-dropdown > input.dropdown__input.js-search-field.t-track-location-selector")).click();
        clearInput("body.aem-wrap--mainpage div.root.parsys:nth-child(2) div.aem-wrap--columncontrol:nth-child(1) div.row.row--full-width div.col.col--span-1-1 div.aem-wrap--masthead.section div.homepage-masthead.js-homepage-masthead div.homepage-masthead__search-bar.js-search-bar div.search-bar__location.js-selector-parent div.location-selector.js-location-selector.instanced div.location-selector__dropdown.js-location-dropdown > input.dropdown__input.js-search-field.t-track-location-selector");
        typeOnInputBox("body.aem-wrap--mainpage div.root.parsys:nth-child(2) div.aem-wrap--columncontrol:nth-child(1) div.row.row--full-width div.col.col--span-1-1 div.aem-wrap--masthead.section div.homepage-masthead.js-homepage-masthead div.homepage-masthead__search-bar.js-search-bar div.search-bar__location.js-selector-parent div.location-selector.js-location-selector.instanced div.location-selector__dropdown.js-location-dropdown > input.dropdown__input.js-search-field.t-track-location-selector","New York");
        homePage.clickSearchJobs();
        String expectedText = "Bank of America Jobs: Search & Apply for Bank of America Careers";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");

    }

    @Test
    //change location from New york to Nevada
    public void checkCityResults() throws InterruptedException {
        homePage.closePopUp();
        homePage.clickCareer();
        //Thread.sleep(1000);
        homePage.CloseCookies();
        driver.findElement(By.cssSelector("body.aem-wrap--mainpage div.root.parsys:nth-child(2) div.aem-wrap--columncontrol:nth-child(1) div.row.row--full-width div.col.col--span-1-1 div.aem-wrap--masthead.section div.homepage-masthead.js-homepage-masthead div.homepage-masthead__search-bar.js-search-bar div.search-bar__location.js-selector-parent div.location-selector.js-location-selector.instanced div.location-selector__dropdown.js-location-dropdown > input.dropdown__input.js-search-field.t-track-location-selector")).click();
        clearInput("body.aem-wrap--mainpage div.root.parsys:nth-child(2) div.aem-wrap--columncontrol:nth-child(1) div.row.row--full-width div.col.col--span-1-1 div.aem-wrap--masthead.section div.homepage-masthead.js-homepage-masthead div.homepage-masthead__search-bar.js-search-bar div.search-bar__location.js-selector-parent div.location-selector.js-location-selector.instanced div.location-selector__dropdown.js-location-dropdown > input.dropdown__input.js-search-field.t-track-location-selector");
        typeOnInputBox("body.aem-wrap--mainpage div.root.parsys:nth-child(2) div.aem-wrap--columncontrol:nth-child(1) div.row.row--full-width div.col.col--span-1-1 div.aem-wrap--masthead.section div.homepage-masthead.js-homepage-masthead div.homepage-masthead__search-bar.js-search-bar div.search-bar__location.js-selector-parent div.location-selector.js-location-selector.instanced div.location-selector__dropdown.js-location-dropdown > input.dropdown__input.js-search-field.t-track-location-selector", "Nevada");
        homePage.clickSearchJobs();
        homePage.clickCareerLocationBox();
        String expectedText = "Bank of America Jobs: Search & Apply for Bank of America Careers";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    @Test
    public void oldestToNewest() throws InterruptedException {
        homePage.closePopUp();
        homePage.clickCareer();
        homePage.CloseCookies();
        driver.findElement(By.cssSelector("body.aem-wrap--mainpage div.root.parsys:nth-child(2) div.aem-wrap--columncontrol:nth-child(1) div.row.row--full-width div.col.col--span-1-1 div.aem-wrap--masthead.section div.homepage-masthead.js-homepage-masthead div.homepage-masthead__search-bar.js-search-bar div.search-bar__location.js-selector-parent div.location-selector.js-location-selector.instanced div.location-selector__dropdown.js-location-dropdown > input.dropdown__input.js-search-field.t-track-location-selector")).click();
        clearInput("body.aem-wrap--mainpage div.root.parsys:nth-child(2) div.aem-wrap--columncontrol:nth-child(1) div.row.row--full-width div.col.col--span-1-1 div.aem-wrap--masthead.section div.homepage-masthead.js-homepage-masthead div.homepage-masthead__search-bar.js-search-bar div.search-bar__location.js-selector-parent div.location-selector.js-location-selector.instanced div.location-selector__dropdown.js-location-dropdown > input.dropdown__input.js-search-field.t-track-location-selector");
        typeOnInputBox("body.aem-wrap--mainpage div.root.parsys:nth-child(2) div.aem-wrap--columncontrol:nth-child(1) div.row.row--full-width div.col.col--span-1-1 div.aem-wrap--masthead.section div.homepage-masthead.js-homepage-masthead div.homepage-masthead__search-bar.js-search-bar div.search-bar__location.js-selector-parent div.location-selector.js-location-selector.instanced div.location-selector__dropdown.js-location-dropdown > input.dropdown__input.js-search-field.t-track-location-selector","New York");
        driver.findElement(By.cssSelector("body.aem-wrap--mainpage div.root.parsys:nth-child(2) div.aem-wrap--columncontrol:nth-child(1) div.row.row--full-width div.col.col--span-1-1 div.aem-wrap--masthead.section div.homepage-masthead.js-homepage-masthead div.homepage-masthead__search-bar.js-search-bar div.search-bar__location.js-selector-parent div.location-selector.js-location-selector.instanced div.location-selector__dropdown.js-location-dropdown ul.location-selector__items li.location-selector__item:nth-child(2) a.item__data > strong:nth-child(1)")).click();
        driver.findElement(By.cssSelector("body.aem-wrap--mainpage div.root.parsys:nth-child(2) div.aem-wrap--columncontrol div.row.row--mp-search-content.no-styles div.col.col--mp--search--span-2-4:nth-child(2) div.aem-wrap--job-search-results-listing.section div.job-search-filter-list.js-job-search-filter-list div.content__filters div.filters.js-filters div.filters__dropdowns.js-filters__dropdowns div.dropdowns.js-dropdowns div.dropdowns__dropdown.js-dropdown.dropdown--sort.js-dropdown--sort div.col div.form__check div.form__check__custom div.custom-select-wrapper div.custom-select > div.custom-select__trigger")).click();
        driver.findElement(By.cssSelector("body.aem-wrap--mainpage div.root.parsys:nth-child(2) div.aem-wrap--columncontrol div.row.row--mp-search-content.no-styles div.col.col--mp--search--span-2-4:nth-child(2) div.aem-wrap--job-search-results-listing.section div.job-search-filter-list.js-job-search-filter-list div.content__filters div.filters.js-filters div.filters__dropdowns.js-filters__dropdowns div.dropdowns.js-dropdowns div.dropdowns__dropdown.js-dropdown.dropdown--sort.js-dropdown--sort div.col div.form__check div.form__check__custom div.custom-select-wrapper div.custom-select.open ul.custom-options > li.custom-option:nth-child(4)")).click();
    }
    @Test
    public void checkCompanyPage() {
        homePage.closePopUp();
        homePage.clickCareer();
        homePage.CloseCookies();
        homePage.clickOnElement("//header/nav[1]/div[1]/div[1]/div[1]/div[1]/a[1]");
        String expectedText = "About Our Company - Bank of America Careers";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    @Test
    public void verifyCulturePage() {
        homePage.closePopUp();
        homePage.clickCareer();
        homePage.CloseCookies();
        homePage.clickOnElement("//header/nav[1]/div[1]/div[1]/div[1]/div[2]/a[1]");
        String expectedText = "Our Company Culture - Working at Bank of America";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    @Test
    public void verifyJoiningUsPage() {
        homePage.closePopUp();
        homePage.clickCareer();
        homePage.CloseCookies();
        homePage.clickOnElement("//header/nav[1]/div[1]/div[1]/div[1]/div[3]/a[1]");
        String expectedText = "Join Bank of America - How we Hire & Welcome Employees";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    @Test
    public void verifyBenefitsPage() {
        homePage.closePopUp();
        homePage.clickCareer();
        homePage.CloseCookies();
        homePage.clickOnElement("//header/nav[1]/div[1]/div[1]/div[1]/div[4]/a[1]");
        String expectedText = "Bank of America Employee Benefits, Perks & Discount Programs";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }
}

