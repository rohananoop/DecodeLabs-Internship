import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class DecodeLabs_Java_P1{
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int target=random.nextInt(100)+1;

        System.out.println("Guess a number between 1 and 100!");
        System.out.println("You have only 5 chances!");

        int guess=0,counter=0;
        do{
            try{
                System.out.println("\nEnter guess: ");
                guess=sc.nextInt();
                sc.nextLine();
                counter++;

                if(guess==target)
                  System.out.println("\nCORRECT GUESS IN "+counter+" ATTEMPTS\n");
                else if(guess<=target)
                  System.out.println("Too Low\n");
                else
                  System.out.println("Too High\n");
                if (guess != target)
                    System.out.println("Chances left: " + (5 - counter));
            
            }catch(InputMismatchException e){
                System.out.println("Invalid input! please enter an integer.\n");
                sc.nextLine();
             }
        }while(guess!=target && counter<5);

        if(guess!=target)
          System.out.println("\nGAME OVER! THE NUMBER WAS "+target);
    sc.close();
   }
}



