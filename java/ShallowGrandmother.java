import java.util.Scanner;

public class ShallowGrandmother {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int age;
        double income, cute;
        boolean allowed;

        System.out.print("enter your age: ");
        age = keyboard.nextInt();

        System.out.print("enter your yearly income: ");
        income = keyboard.nextDouble();

        System.out.print("how cute are you, on scale from 0.0 to 10.? ");
        cute = keyboard.nextDouble();

        allowed = (age > 25 && age < 40 && (income > 50000 || cute >= 0.5));

        System.out.print("allowed to date my grandchild " + allowed);

    }

}
