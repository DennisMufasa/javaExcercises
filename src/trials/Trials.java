package trials;

import java.util.Scanner;

public class Trials {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your Name in the space below.");
        String name = input.next();

        System.out.println("Please Enter your mobile number");

        if (input.hasNextInt()) {

            int phone = input.nextInt();
            System.out.println("Hello " + name + ". The system has detected this" + phone + " as your personal number.");

        } else {
            System.out.println("Wrong format of data. Try Again?!");
        }

    }

}
