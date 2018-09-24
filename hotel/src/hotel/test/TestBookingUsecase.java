/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.test;

import hotel.HotelHelper;
import hotel.booking.BookingCTL;
import hotel.entities.Hotel;
import hotel.entities.RoomType;
import hotel.utils.IOUtils;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kosala
 */
public class TestBookingUsecase {

    private static Hotel hotel;

    public static void main(String[] args) {

        Testing_bookingTimesEntered_Method();

    }

    /*
    private static void Testing_phoneNumberEntered_Method() {
        hotel=new Hotel();
        IOUtils.outputln("\nBooking Room\n");
	new BookingCTL(hotel).run();
    }
     */

    private static void Testing_phoneNumberEntered_Method() {
        hotel = new Hotel();
        IOUtils.outputln("\nBooking Room\n");
        int phoneNumber = 1841;
        new BookingCTL(hotel).phoneNumberEntered(1841);

    }

    private static void Testing_guestDetailsEntered_Method() {
        hotel = new Hotel();
        IOUtils.outputln("\nBooking Room\n");
        new BookingCTL(hotel).guestDetailsEntered("KOsala", "Glen Waverley");

    }

    private static void Testing_roomTypeAndOccupantsEntered_Method() {
        hotel = new Hotel();
        IOUtils.outputln("\nBooking Room\n");
        new BookingCTL(hotel).roomTypeAndOccupantsEntered(RoomType.DOUBLE, 1);

    }

    private static void Testing_bookingTimesEntered_Method() {

        try {
            hotel = HotelHelper.loadHotel();
            IOUtils.outputln("\nBooking Room\n");
            new BookingCTL(hotel).run();
        } catch (Exception ex) {
            Logger.getLogger(TestBookingUsecase.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
