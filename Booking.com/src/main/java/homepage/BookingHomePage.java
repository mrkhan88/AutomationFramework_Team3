package homepage;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import javax.swing.*;

import static homepage.BookingHomePageWebElement.*;

public class BookingHomePage extends WebAPI {
    // Action Method class

    // Find By Annotation: First Approach
    @FindBy(how = How.XPATH, using = flightTab)
    public WebElement flightXP;
    @FindBy(how = How.XPATH, using = search)
    public WebElement searchXP;
    @FindBy(how = How.XPATH, using = search2)
    public WebElement search2XP;
    @FindBy(how = How.XPATH, using = searchDropDown)
    public WebElement searchDropDownXP;
    @FindBy(how = How.XPATH, using = dropBox)
    public WebElement dropBoxXP;
    @FindBy(how = How.XPATH, using = countriesTab)
    public WebElement countriesXP;
    @FindBy(how = How.XPATH, using = regionsTab)
    public WebElement regionsXP;
    @FindBy(how = How.XPATH, using = citiesTab)
    public WebElement citiesXP;
    @FindBy(how = How.XPATH, using = districtsTab)
    public WebElement districtsXP;
    @FindBy(how = How.XPATH, using = airportsTab)
    public WebElement airportsXP;
    @FindBy(how = How.XPATH, using = hotelsTab)
    public WebElement hotelsXP;
    @FindBy(how = How.XPATH, using = placesOfInterestTab)
    public WebElement placeOfInterestXP;
    @FindBy(how = How.XPATH, using = homesTab)
    public WebElement homes;
    @FindBy(how = How.XPATH, using = apartmentsTab)
    public WebElement apartments;
    @FindBy(how = How.XPATH, using = resortsTab)
    public WebElement resorts;
    @FindBy(how = How.XPATH, using = villasTab)
    public WebElement villas;
    @FindBy(how = How.XPATH, using = hostelsTab)
    public WebElement hostels;
    @FindBy(how = How.XPATH, using = bnbsTab)
    public WebElement bnbs;
    @FindBy(how = How.XPATH, using = guestHomeTab)
    public WebElement guestHome;
    @FindBy(how = How.XPATH, using = uniquePlacesToStayTab)
    public WebElement uniquePlacesToStay;
    @FindBy(how = How.XPATH, using = allDestinationsTab)
    public WebElement allDestinations;
    @FindBy(how = How.XPATH, using = reviewsTab)
    public WebElement reviews;
    @FindBy(how = How.XPATH, using = unpackedTab)
    public WebElement unpacked;
    @FindBy(how = How.XPATH, using = travelCommunitiesTab)
    public WebElement travelCommunities;
    @FindBy(how = How.XPATH, using = seasonalAndHolidayDealsTab)
    public WebElement seasonalAndHolidayDeals;
    @FindBy(how = How.XPATH, using = carRentalsTab)
    public WebElement carRentals;
    @FindBy(how = How.XPATH, using = flightFinderTab)
    public WebElement flightFinder;
    @FindBy(how = How.XPATH, using = restaurantReservationsTab)
    public WebElement restaurantReservations;
    @FindBy(how = How.XPATH, using = bookingForTravelAgentsTab)
    public WebElement bookingForTravelAgents;
    @FindBy(how = How.XPATH, using = covid19FaqsTab)
    public WebElement covid19Faqs;
    @FindBy(how = How.XPATH, using = aboutbookingTab)
    public WebElement aboutbooking;
    @FindBy(how = How.XPATH, using = contactCustomerServiceTab)
    public WebElement contactCustomerService;
    @FindBy(how = How.XPATH, using = partnerHelpTab)
    public WebElement partnerHelp;
    @FindBy(how = How.XPATH, using = careersTab)
    public WebElement careers;
    @FindBy(how = How.XPATH, using = sustainabilityTab)
    public WebElement sustainability;
    @FindBy(how = How.XPATH, using = pressCenterTab)
    public WebElement pressCenter;
    @FindBy(how = How.XPATH, using = safetyResourceCenterTab)
    public WebElement safetyResourceCenter;
    @FindBy(how = How.XPATH, using = investorRelationsTab)
    public WebElement investorRelations;
    @FindBy(how = How.XPATH, using = termsConditionsTab)
    public WebElement termsConditions;
    @FindBy(how = How.XPATH, using = partnerDisputeTab)
    public WebElement partnerDispute;
    @FindBy(how = How.XPATH, using = privacyCookieStatementTab)
    public WebElement privacyCookieStatement;
    @FindBy(how = How.XPATH, using = corporateContactTab)
    public WebElement corporateContact;

    public void flightTab() throws InterruptedException {
        flightXP.click();
        sleepFor(3);

    }

    public void search() throws InterruptedException {
        searchXP.sendKeys("London");
        sleepFor(5);

    }

    public void search2() throws InterruptedException {
        search2XP.sendKeys("egy");
        sleepFor(3);

    }

    public void clickAndDrag() throws InterruptedException {
        WebElement source = driver.findElement(By.xpath("//*[@class='bui-avatar__image']"));
        WebElement destination = searchXP;
        Actions actions = new Actions(driver);
        actions.dragAndDrop(source, destination).build().perform();
        sleepFor(5);
    }

    public void countries() throws InterruptedException {
        countriesXP.click();
        sleepFor(3);

    }
    public void regions() throws InterruptedException {
        regionsXP.click();
        sleepFor(3);
    }
    public void cities() throws InterruptedException {
        citiesXP.click();
        sleepFor(3);
    }
    public void districts() throws InterruptedException {
        districtsXP.click();
        sleepFor(3);

    }    public void airports() throws InterruptedException {
        airportsXP.click();
        sleepFor(3);

    }    public void hotels() throws InterruptedException {
        hotelsXP.click();
        sleepFor(3);

    }    public void placeOfInterest() throws InterruptedException {
        placeOfInterestXP.click();
        sleepFor(3);

    }    public void homes() throws InterruptedException {
        homes.click();
        sleepFor(3);

    }    public void apartments() throws InterruptedException {
        apartments.click();
        sleepFor(3);

    }    public void resorts() throws InterruptedException {
        resorts.click();
        sleepFor(3);

    }    public void villas() throws InterruptedException {
        villas.click();
        sleepFor(3);

    }    public void hostels() throws InterruptedException {
        hostels.click();
        sleepFor(3);

    }    public void bnbs() throws InterruptedException {
        bnbs.click();
        sleepFor(3);

    }    public void guestHome() throws InterruptedException {
        guestHome.click();
        sleepFor(3);

    }    public void uniquePlacesToStay() throws InterruptedException {
        uniquePlacesToStay.click();
        sleepFor(3);

    }    public void allDestinations() throws InterruptedException {
        allDestinations.click();
        sleepFor(3);

    }    public void reviews() throws InterruptedException {
        reviews.click();
        sleepFor(3);

    }    public void unpacked() throws InterruptedException {
        unpacked.click();
        sleepFor(3);

    }    public void travelCommunities() throws InterruptedException {
        travelCommunities.click();
        sleepFor(3);

    }    public void seasonalAndHolidayDeals() throws InterruptedException {
        seasonalAndHolidayDeals.click();
        sleepFor(3);

    }    public void carRentals() throws InterruptedException {
        carRentals.click();
        sleepFor(3);

    }    public void flightFinder() throws InterruptedException {
        flightFinder.click();
        sleepFor(3);

    }    public void restaurantReservations() throws InterruptedException {
        restaurantReservations.click();
        sleepFor(3);
    }
    public void bookingForTravelAgents() throws InterruptedException {
        bookingForTravelAgents.click();
        sleepFor(3);
    }
    public void covid19Faqs() throws InterruptedException {
        covid19Faqs.click();
        sleepFor(3);
    }
    public void aboutbooking() throws InterruptedException {
        aboutbooking.click();
        sleepFor(3);
    }
    public void contactCustomerService() throws InterruptedException {
        contactCustomerService.click();
        sleepFor(3);
    }
    public void partnerHelp() throws InterruptedException {
        partnerHelp.click();
        sleepFor(3);
    }
    public void careers() throws InterruptedException {
        careers.click();
        sleepFor(3);
    }
    public void sustainability() throws InterruptedException {
        sustainability.click();
        sleepFor(3);
    }
    public void pressCenter() throws InterruptedException {
        pressCenter.click();
        sleepFor(3);
    }
    public void safetyResourceCenter() throws InterruptedException {
        safetyResourceCenter.click();
        sleepFor(3);
    }
    public void investorRelations() throws InterruptedException {
        investorRelations.click();
        sleepFor(3);
    }
    public void termsConditions() throws InterruptedException {
        termsConditions.click();
        sleepFor(3);
    }
    public void partnerDispute() throws InterruptedException {
        partnerDispute.click();
        sleepFor(3);
    }
    public void privacyCookieStatement() throws InterruptedException {
        privacyCookieStatement.click();
        sleepFor(3);
    }
    public void corporateContact() throws InterruptedException {
        corporateContact.click();
        sleepFor(3);
    }



}