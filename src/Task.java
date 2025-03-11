import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Task {

    private final String task;
    private final LocalDate inputDate;
    private final LocalTime inputTime;

    public Task() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter your task: ");
        this.task = userInput.nextLine();
        this.inputDate = LocalDate.now();
        this.inputTime = LocalTime.now();
        userInput.close();
    }

    public String getTaskDetails() {
        return "Your To-do task is: " + task + ". Task created at: " + inputDate + "  " + inputTime;
    }
}
