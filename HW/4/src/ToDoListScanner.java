import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoListScanner {
    public static Scanner input = new Scanner(System.in);

    public static List<ToDoList> toDoListScanner() throws IOException {

        List<ToDoList> tdListMembers = new ArrayList<>();

        System.out.print("Введите задачу: ");
        String action = input.next();

        System.out.print("Введите приоритет: ");
        String priority = input.next();

        System.out.print("Введите имя: ");
        String name = input.next();

        System.out.print("Введите дату добавления: ");
        String dateAdd = input.next();

        System.out.print("Введите срок: ");
        String deadline = input.next();
        System.out.println();

        ToDoList td = ToDoListCreator
                .getInstance()
                .setAction(action)
                .setPriority(priority)
                .setName(name)
                .setDateAdd(dateAdd)
                .setDeadline(deadline)
                .Create();
        tdListMembers.add(td);

        return tdListMembers;
    }
}
