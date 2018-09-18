/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.test;

import hotel.booking.BookingCTL;
import hotel.entities.Hotel;
import hotel.utils.IOUtils;

/**
 *
 * @author Kosala
 */
public class TestBookingUsecase {

    private static Hotel hotel;

    public static void main(String[] args) {

        Testing_phoneNumberEntered_Method();

    }
/*
    private static void Testing_phoneNumberEntered_Method() {
        hotel=new Hotel();
        IOUtils.outputln("\nBooking Room\n");
	new BookingCTL(hotel).run();
    }
   */
    
    private static void Testing_phoneNumberEntered_Method() {
        hotel=new Hotel();
        IOUtils.outputln("\nBooking Room\n");
        int phoneNumber=1841;
	new BookingCTL(hotel).phoneNumberEntered(1841);
        
    }
}
