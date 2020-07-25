import java.util.Scanner;

class ExamOne {
    public static void main(String[] args) {
        // Take input
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        // Initialize the count
        int countX = 0;
        int countY = 0;
        int countW = 0;
        int countZ = 0;

        // Loop for findout occurance
        for (int i = 0; i < userInput.length(); i++) {
            if (userInput.charAt(i) == 'X') {
                countX += 1;
            } else if (userInput.charAt(i) == 'Y') {
                countY += 1;
            } else if (userInput.charAt(i) == 'W') {
                countW += 1;
            } else if (userInput.charAt(i) == 'Z') {
                countZ += 1;
            }
        }

        // Output
        if (countX > 0) {
            System.out.println("X has appeared " + countX + "x");
        }
        if (countY > 0) {
            System.out.println("Y has appeared " + countY + "x");
        }
        if (countW > 0) {
            System.out.println("W has appeared " + countW + "x");
        }
        if (countZ > 0) {
            System.out.println("Z has appeared " + countZ + "x");
        }

    }
}