import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<String> getTasksForToday() {
        List<String> tasksForToday = new ArrayList<>();
        tasksForToday.add("Finish Java homework");
        tasksForToday.add("Study for exams");
        tasksForToday.add("Attend Java lessons at 6:30 PM");
        tasksForToday.add("Finish a school project");

        return tasksForToday;
    }

    public static void main(String[] args) {
        List<String> tasksForToday = getTasksForToday();

        System.out.println("Tasks for Today:");
        for (String task : tasksForToday) {
            System.out.println("- " + task);
        }
    }
}
