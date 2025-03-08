import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {

            Scanner userInput = new Scanner(System.in);
            System.out.println("Add task:");

            String task = userInput.nextLine(); // Read the entire line as a single task

            System.out.println("Your To-do task is: " + task);
        }
    }