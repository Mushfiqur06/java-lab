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

    public static void main(String[] args) {
        Task2();
    }
}