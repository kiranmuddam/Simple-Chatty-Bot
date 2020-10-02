package bot;

import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in); // Do not change this line

    public static void main(String[] args) {
        greet("Curvy", "2020"); // change it as you need
        remindName();
        guessAge();
        count();
        test();
        end();
    }

    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Say me remainders of dividing your age by 3, 5 and 7.");
        int remOf3 = scanner.nextInt();
        int remOf5 = scanner.nextInt();
        int remOf7 = scanner.nextInt();
        int age = (remOf3 * 70 + remOf5 * 21 + remOf7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test() {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("What is the capital of country India ?");
        System.out.println(" 1. Hyderabad \n 2. Delhi \n 3. Chennai \n 4. Mumbai");
        int userAnswer = scanner.nextInt();
        int correctAnswer = 2;
        while (userAnswer != correctAnswer) {
            System.out.println("Please, try again.");
            userAnswer = scanner.nextInt();
        }
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!"); // Do not change this text
    }
}
