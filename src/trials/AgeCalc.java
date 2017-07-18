package trials;

import java.util.Calendar;
import java.util.Scanner;

public class AgeCalc {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your year of birth.");
        if (input.hasNextInt()) {
            int YOB = input.nextInt();

            new AgeCalc().getAge(YOB);

            //     System.out.println("You are turning " +Age+ " this year. Congructulations!!");
        } else {
            System.out.println("Wrong data format. Try Again!");
        }

    }

    public void getAge(int CurrentYear) {
        new AgeCalc().getYear();
        int Age;
        // Age = (CurrentYear-YOB );

    }

    public void getYear() {

        Calendar cal = Calendar.getInstance();
        int CurrentYear = cal.get(Calendar.YEAR);

    }
}
