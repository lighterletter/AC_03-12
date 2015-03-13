package nyc.c4q.lighterletter;

import java.util.Scanner;

/**
 * Created by c4q-john on 3/12/15.
 */
public class drawRocket {

//
    public static void drawLine2 (int size) {
        String line = "+";
        for (int i =0; i < size; i++) {
            line += "+=+=";
        }
        line += "+";

        System.out.println(line);

    }
    public static void drawLine3 (int size) {
        String line = "\\|";
        for (int i =0; i < size; i++) {
            line += "+=+=";
        }
        line += "+";

        System.out.println(line);

    }



    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Type in the size of your rocket.");

        int rocket = input.nextInt();
        drawLine(rocket);

    }


}
