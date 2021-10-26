import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;
import java.lang.Math;


class blackjack{

     public static void main (String str[]) throws IOException {
          Scanner scan = new Scanner(System.in);
          boolean game = true;
          //while (game == true);
             double card1 = (1 + (Math.random()*13));
             double card2 = (1 + (Math.random()*13));
             double card3 =  (1 + (Math.random()*13));
             
             if (card1 > 10);
               card1 == 10;
             if (card2 > 10);
               card2 == 10;
             if (card3 > 10);
               card3 == 10:
             
             int car1 = (int)card1;
             int car2 = (int)card2;
             int car3 = (int)card3;

             System.out.println("Your current hand is " + car1 + " and " + car2 + " = " + (car1 + car2));
             System.out.println("Would you like another card? Inputs: Yes or No");
             
                              
     }

}

