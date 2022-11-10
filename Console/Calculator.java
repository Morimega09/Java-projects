package Console;

import java.util.Scanner;

public class Calculator{

    Scanner in = new Scanner(System.in);
    int payment, hours, days, percentage;
    String NP, PA;

    public static void main(String[] args) {
        
    }

    void options(){
        System.out.print("How much do you get paid per hour?: ");
        payment = in.nextInt();

        System.out.print("\nHow many hours do you work daily: ");
        hours = in.nextInt();

        System.out.print("\nFor how many days?: ");
        days = in.nextInt();
    }

    void features(){
        System.out.print("\nPerfect Attendance? (Y/N): ");
        PA = (in.nextLine().trim()).substring(0, 1);

        System.out.print("\nNight Premium? (Y/N): ");
        NP = (in.nextLine().trim()).substring(0, 1);
    }

    void nightPremium(){
        switch(percentage){
            case 0:
                break;

            case 1:
                break;

            default:
                break;
        }
    }
}