import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        output("Generate 10 random integers between 0 and 6");
        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {
            int randomInt = rnd.nextInt(7);
            output("Generated number: " + randomInt);
        }

        output("Done.");

        Scanner keyboard = new Scanner(System.in);

        String userInput = "dummy";
        System.out.println("Enter as much text as you want. Type 'q' to quit.");

        while (!userInput.equals("q")) {
            userInput = keyboard.next();
            System.out.println(userInput);
        }

        int num, total, nums;
        nums = 0;
        total = 0;

        System.out.println("Enter 10 numbers");

        while (nums < 10) {
            num = keyboard.nextInt();
            total += num;
            nums++;
        }

        System.out.println("The total of all 10 numbers is " + total);
    }

    private static void output(String aMessage) {
        System.out.println(aMessage);
    }
}
