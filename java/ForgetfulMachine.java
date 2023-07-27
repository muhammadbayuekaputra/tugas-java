import java.util.Scanner;

public class ForgetfulMachine {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("what city is the capital of france");
        keyboard.next();

        System.out.print("what is 6 multiplied by ?? ");
        keyboard.nextInt();

        System.out.println("enter a number beetwen 0.0 and 0.17");
        keyboard.nextDouble();

        System.out.println("is there anything else you would like to say?");
        keyboard.next();

    }

}
