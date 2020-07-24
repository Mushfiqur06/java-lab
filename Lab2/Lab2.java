import java.util.Scanner;

public class Lab2 {
    public static void Task1() {
        Scanner kb = new Scanner(System.in);

        // Get a string from the user
        System.out.print("Enter a String ");
        String str = kb.nextLine();
        System.out.println(str.length());
    }

    public static void Task2() {
        Scanner kb = new Scanner(System.in);
        System.out.print("Please enter a String: ");
        String charStr = kb.nextLine();
        for (int i = 0; i < charStr.length(); i++) {
            System.out.println(charStr.charAt(i));
        }
    }

    public static void Task3() {
        Scanner kb = new Scanner(System.in);
        // Get a word from the user
        System.out.print("Please Enter a word: ");
        String str = kb.nextLine();

        for (int i = 0; i < str.length(); i++) {
            int codeForCh = str.codePointAt(i);
            System.out.println(str.charAt(i) + " : " + codeForCh);
        }
    }

    public static void Task4() {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = kb.nextLine();

        for (char i = 'A'; i <= 'Z'; i++) {
            char anotherCharStore = i;
            long count = str.chars().filter(item -> item == anotherCharStore).count();
            System.out.println((char) ('A' + i) + " which is " + ('A' + i) + " was found " + count + " Times");

        }
    }

    public static void main(String[] args) {
        Task4();
    }
}