package apllication;

import model.Exception.DomainException;
import model.entitis.reservate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class progtam {
    public static void main(String[] args)  {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        try {

            System.out.print("Room number: ");
            Integer room = sc.nextInt();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            Date checkIn = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            Date checkOut = sdf.parse(sc.next());


            reservate reservation = new reservate(room, checkIn, checkOut);
            System.out.println("reservate = " + reservation);

            System.out.println("Enter data to update the reservation: ");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());

            reservation.updateDates(checkIn, checkOut);
            System.out.println("reservate = " + reservation);

        }
        catch (ParseException e){
            System.out.println("invalid date format");
        }
        catch (DomainException e){
            System.out.println("error in reservation " + e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println("Unexpected error");
        }



        sc.close();

    }
}
