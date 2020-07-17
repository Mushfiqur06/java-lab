import java.util.Scanner;
import java.lang.Math;

public class Task {
    // Task One
    public static void TaskOne() {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a Number ");
        int num = kb.nextInt();
        System.out.println(num);
    }

    public static void TaskTwo() {
        Scanner kb = new Scanner(System.in);
        // Volate from the user
        System.out.print("Enter Voltage: ");
        double voltage = kb.nextDouble();
        // Resistance from the user
        System.out.print("Enter Resistance: ");
        double resistance = kb.nextDouble();
        // Inductance from the user
        System.out.print("Enter inductance: ");
        double inductance = kb.nextDouble();
        // Capacitance from the user
        System.out.print("Enter Capacitance: ");
        double capacitance = kb.nextDouble();
        // Frequency from the user
        System.out.print("Enter Frequency: ");
        double frequency = kb.nextDouble();

        double pi = Math.PI;

        double resistanceSquared = Math.pow(resistance, 2);
        double twoPiL = (2 * pi * inductance);
        double dividOne = (1 / (2 * pi * frequency * capacitance));
        double twoPiLOne = twoPiL - dividOne;

        double rSqrtAndtwoPiL = resistanceSquared + twoPiLOne;
        double sqrtOf = Math.sqrt(rSqrtAndtwoPiL);

        double resultI = sqrtOf / voltage;

        System.out.println("The Current (I) is: " + resultI);

    }

    public static void TaskThree() {
        Scanner kb = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter Number-" + i + ":");
            System.out.println("You have entered " + kb.nextInt());
        }
    }

    public static void TaskFour() {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = kb.nextInt();

        if (num % 2 == 0) {
            System.out.println("The number is Even.");
        } else {
            System.out.println("The number is Odd");
        }
    }

    public static void TaskFive() {
        Scanner kb = new Scanner(System.in);
        // Initialize array
        int[] arr = new int[10];
        // enter 10 integers
        System.out.println("Please enter 10 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.println();
        System.out.println("Array in reverse order: ");
        // Loop through the array in reverse order
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        TaskFive();
    }
}