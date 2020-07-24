import java.util.Scanner;

public class Lab2 {
    public static void Task1() {
        Scanner kb = new Scanner(System.in);

        // Get a string from the user
        System.out.print("Enter a String ");
        String str = kb.nextLine();
        System.out.println(str);
    }

    public static void main(String[] args) {
        Task1();
    }
}