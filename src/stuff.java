import java.util.Scanner;

public class stuff {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What's your name buddy?");
        String Name = input.nextLine();
        System.out.println("Nice to meet you " + Name + ".");
        System.out.println("Okay, " + Name + " How old are you?");
        Integer age = input.nextInt();
        System.out.println("You're " + String.valueOf(age) + " thats cute.");
    }


}
