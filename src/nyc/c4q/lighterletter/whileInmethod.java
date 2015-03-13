package nyc.c4q.lighterletter;

import java.util.Scanner;

/**
 * Created by c4q-john on 3/12/15.
 */
public class whileInmethod {


    public static int livesLeft (int lives) {

        for (int i = 0; i < 10; i++) {


        }
        return lives;

    }
    public static void main(String [] args) {

        System.out.println("Give me a number");
        Scanner key = new Scanner(System.in);

        int input = key.nextInt();

        System.out.println(livesLeft(input));
        while (livesLeft(input) < 5) {


        }
        while (livesLeft(input)==0) {

            System.out.println("Game over!");

        }


    }
}
