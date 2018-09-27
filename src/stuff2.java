import java.awt.*;
import java.util.Scanner;

public class stuff2 {
    public static void main(String[] args) {
        System.out.println("Hello I am a robot what be your name citizen.");
        Scanner input = new Scanner(System.in);
        String playerName = input.nextLine();
        System.out.println("Cool name now i shall guess any number of your choosing " + playerName + "that is between 1 and 100!");
        System.out.println("Before we start to play this game every time i make a guess you will:");
        System.out.println("Type z if my guess is correct");
        System.out.println("Type x if my guess is too high");
        System.out.println("Type c if my guess is too low");
        System.out.println("Shall we begin!");

        int guess = 50;
        int edit = 25;

        System.out.println("Is your number .... " + guess + "?");
        String what = input.next();
        while(!(what.equals("z"))){
            if (what.equals("x")) {
                guess -= edit;
                System.out.println("Well then how about ...." + guess + "?");

            }
            if (what.equals("c")) {
                guess += edit;
                System.out.println("Well then how about ...." + guess + "?");
            }
            what = input.next();
            edit = edit / 2;
            if(edit < 1);
            edit = 1;
        }
        System.out.println("Perfect i guessed it correct am i not amazing" + playerName);
    }}
/*
    public static void terminator(String[] args) {
        System.out.println("Hello I am a robot what be your name citizen.");
        Scanner input = new Scanner(System.in);
        String playerName = input.nextLine();
        System.out.println("Cool name now i shall guess any number of your choosing " + playerName + "that is between 1 and 100!");
        System.out.println("Before we start to play this game every time i make a guess you will:");
        System.out.println("Type z if my guess is correct");
        System.out.println("Type x if my guess is too high");
        System.out.println("Type c if my guess is too high");
        System.out.println("Shall we begin!");

        int guess = 50;
        int edit = 25;

        System.out.println("Is your number .... " + guess + "?");
        String what = input.next();

            if (what.equals("x")) {
                guess -= edit;
                System.out.println("Well then how about ...." + guess + "?");
                what = input.next();
            }
            if (what.equals("c")) {
                guess += edit;
                System.out.println("Well then how about ...." + guess + "?");
                what = input.next();

            }
            edit = edit / 2;
        if (what.equals("z")) {
            System.out.println("Perfect i guessed it correct am i not amazing" + playerName);
        }
        what = input.next();

    }
}


        int rando = (int)(100 * (Math.random()));
        Scanner input = new Scanner(System.in);
        System.out.println("Can you guess how many bannanas are in this jar, just imagine there is one(Hint: its between 1 and 100)");
        int guess = input.nextInt();
        while(!(guess == rando)){
            System.out.println("Incorrect try again n00b");
            guess = input.nextInt();
        }
        if(guess == rando){
            System.out.println("correct");
        }

    }
}
*/
