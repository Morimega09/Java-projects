package Console;

import java.util.Scanner;

public class Calculator{

        public static void main(String[] args) {

            // np means Night Premium (Additional 15% if you work till 12:00 AM)
            boolean np = false;

            // Modify those values to match your company standars
            final double EXTRA_TIME_PAYMENT = 0.35;
            final double NIGHT_PREMIUM_PAYMENT = 0.15;

            /* 
             * If we work from 2 PM to 11 PM, every hour after
             * 9PM will be applied with the 15%, so making the maths
             * that means that 2 hours out from 9 hours means 22.22% of the time.
             * 
             * In fact, to get the exact time of hours that needs to be applied the 15%
             * we should use the next "formula": aux * 0.2222. 
             * 
             * Should I put the worked * price into a variable? Cause I'm using that one a lot...
             * -> Yep, I converted the ´price * worked´ into ´aux´ 
             */

            // STDIN used.
            Scanner in = new Scanner(System.in);

            // It's self explanatory
            System.out.print("How many hours worked?: ");
            double worked = in.nextInt();

            // Same as above
            System.out.print("\nHow much per hour?: ");
            double price = in.nextInt();

            // just to make the code looks better XD
            double aux = price * worked;

            //Asking if there's extra hours worked.
            System.out.print("How many extra hours within those worked hours?: ");
            double extra = in.nextInt();

            //Asking if the Night Premium is available 
            System.out.print("Night premium? (Y/N): ");
            String verify = in.nextLine();
            if(verify.equalsIgnoreCase("Y")) np = true;

            // Calculating the total
            double total = aux + (extra * price * EXTRA_TIME_PAYMENT);

            // If Night Premium = true
            total += np ? aux * NIGHT_PREMIUM_PAYMENT : 0;

            // Printing the result
            System.out.println("\nYou won $" + total + ".");

            // Closing the STDIN.
            in.close();
    }
}