import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner userInput = new Scanner((System.in));
            System.out.println("Add task");

            String[] task = new String[3];
            task[0] = userInput.next();
            task[1] = userInput.next();
            task[2] = userInput.next();

            System.out.println("Your To-do task is :" + task[0]);
            System.out.println("Your To-do task is :" + task[1]);
            System.out.println("Your To-do task is :" + task[2]);


        }
    }