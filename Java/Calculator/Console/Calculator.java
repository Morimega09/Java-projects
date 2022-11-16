package Console;

import java.util.Scanner;

public class Calculator{

        public static void main(String[] args) {

            // NightPremium (Additional 15% if you work till 12:00 AM)
            boolean NightPremium = false;
            boolean AllHours = false;

            // Modify those values to match your company standars
            final double EXTRA_TIME_PAYMENT = 0.35;
            final double NIGHT_PREMIUM_PAYMENT = 0.15;
            final double TOTAL_HOURS_PREMIUM = 0.2222;

            // STDIN used.
            Scanner in = new Scanner(System.in);

            // It's self explanatory
            System.out.print("How many hours worked?: ");
            double worked = in.nextInt();

            // Same as above
            System.out.print("\nHow much per hour?: ");
            double price = in.nextInt();

            // Just to make the code looks better XD
            double aux = price * worked;

            // Asking if there's extra hours worked.
            System.out.print("How many extra hours within those worked hours?: ");
            double extra = in.nextInt();

            // Asking if the Night Premium is available 
            System.out.print("Night premium? (Y/N): ");
            String verify = in.next();
            if(verify.equalsIgnoreCase("Y")){
                NightPremium = true;

                // Asking if all the hours will be count as 15%
                System.out.print("All the hours? (Y/N): ");
                verify = in.next();
                AllHours = verify.equalsIgnoreCase("Y") ? true : false;
            }

            // Calculating the total
            double total = aux + (extra * price * EXTRA_TIME_PAYMENT);

            // If Night Premium = true
            total += NightPremium ? AllHours ? aux * NIGHT_PREMIUM_PAYMENT : aux * TOTAL_HOURS_PREMIUM * NIGHT_PREMIUM_PAYMENT : 0;

            // Printing the result
            System.out.println("\nYou won $" + total);

            // Closing the STDIN.
            in.close();
    }
}