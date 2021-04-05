package testcases;

import booking.pages.BookingHomepage;
import booking.pages.FlightandHotelPage;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FlightandHotelTest extends WebAPI {
    BookingHomepage booking;
    FlightandHotelPage flight;

    @BeforeMethod
    public void getinit(){
        booking = PageFactory.initElements(driver, BookingHomepage.class);
        flight = PageFactory.initElements(driver, FlightandHotelPage.class);
    }

    @Test(priority = 1)
    public void flighthoteltest(){

        booking.clickFlightnHotel();
        flight.typeinWherFrominputBox();
        flight.clickOnNewYork();
        flight.typeinWhereToinputbox();
        flight.selectPreferedCity();
        flight.clickonCalender();

        sleepFor(5);

    }



}
