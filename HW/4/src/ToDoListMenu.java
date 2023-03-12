import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class ToDoListMenu {
  public static Scanner input = new Scanner(System.in);

  public static void toDoListMenu(String text) throws IOException {
    System.out.println(text);
    System.out.print("Ввод: ");
    Integer num = input.nextInt();
    System.out.println();

    if (num == 1) {
      List<ToDoList> tdListMembers = ToDoListScanner.toDoListScanner();
      ToDoListExport.toDoListExport(tdListMembers);
      System.out.println("Элемент добавлен");
    }

    if (num == 2) {
      ToDoListImport.toDoListImport();
    }
  }
}
