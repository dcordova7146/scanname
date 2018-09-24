import java.awt.*;
import java.util.Scanner;

public class stuff2 {
    public static void main(String[] args)
    {
        int rando = 100 * (100 * (int)(Math.random()));
        Scanner input = new Scanner(System.in);
        System.out.println("Can you guess how many bannanas are in this jar, just imagine there is one");
        int guess = input.nextInt();
        while(!(guess == rando)){
            System.out.println("Incorrect try again n00b");
        }
        if(guess == rando){
            System.out.println("correct");
        }
    }
}
