import java.io.*;
import java.util.*;
import static java.lang.System.*;

import java.util.Scanner;
import java.lang.Math;


class blackjack{

     public static void main (String str[]) throws IOException {
          Scanner scan = new Scanner(System.in);
          boolean play = true;
          double card1 = (1 + (Math.random()*13));
          double card2 = (1 + (Math.random()*13));
          if (card1 > 10)
               card1 == 10;
          if (card2 > 10)
               card2 == 10;
          int car1 = (int)card1;
          int car2 = (int)card2;
          int total = car1 + car2;
          
          System.out.println("Would you like another card? Inputs: Yes or No");
          String input = Scanner.nextLine();
          if( input.toLowerCase().equals("no") || input.toLowerCase().equals("no ") )
              play = false;
          
          ArrayList<Integer> cards = {car1, car2};
          
          while(total < 21 && play == true)
          {
               System.out.println("Your current hand is " + cards + " = " + (total));
               System.out.println("Would you like another card? Inputs: Yes or No");
               String input = Scanner.nextLine();
               if( input.toLowerCase().equals("no") || input.toLowerCase().equals("no ") )
                    play = false;
               
          }
                              
     }

}

