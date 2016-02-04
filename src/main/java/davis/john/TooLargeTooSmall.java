package davis.john;

import java.util.Scanner;

/**
 * Created by jrdavis on 2/4/16.
 */
public class TooLargeTooSmall {


    public static void main(String[] args) {

        int count = 0;
        int secretNumber;
        int n;
        secretNumber = (int) (Math.random() * 999 + 1);
        System.out.println("Secret number is " + secretNumber); //tells me the answer for testing
        System.out.println("Guess the Secret Number between 1 - 999, I will tell you if you are too high or too low");
        Scanner in = new Scanner(System.in);


        do {
            count++;
            System.out.println("Enter your Guess");
            n = in.nextInt();
            System.out.println("Your secret number is " + n);
            if (n == secretNumber)
                System.out.println("You got the Number!, it took you " + count + " tries");
            if (n > secretNumber)
                System.out.println("The number is lower then that");
            if (n < secretNumber)
                System.out.println("The number is greater then that");
        } while (n != secretNumber);




    }

}