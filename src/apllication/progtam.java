package apllication;

import model.entitis.reservate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class progtam {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        System.out.print("Room number: ");
        Integer room = sc.nextInt();
        System.out.print("Check-in date (dd/MM/yyyy): ");
        Date checkIn = sdf.parse(sc.next());
        System.out.print("Check-out date (dd/MM/yyyy): ");
        Date checkOut = sdf.parse(sc.next());

        if (!checkOut.after(checkIn)){
            System.out.println("Error in reservation: Check-out date must be after check-in date");
        }else{
            reservate reservation = new reservate(room, checkIn, checkOut);
            System.out.println("reservate = "+ reservation);

            System.out.println("Enter data to update the reservation: ");
            System.out.print("Check-in date (dd/MM/yyyy): ");
             checkIn = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
             checkOut = sdf.parse(sc.next());

               String error = reservation.updateDates(checkIn, checkOut);

               if (error != null) {
                   System.out.println("error in reservation" + error);
               }
               if(error == null){
                   System.out.println("reservate = "+ reservation);
               }


        }


    }
}
