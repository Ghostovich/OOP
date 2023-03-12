import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ToDoListExport {
  public static void toDoListExport(List<ToDoList> tdListMembers) throws IOException {
    FileWriter writer = new FileWriter("HW/4/src/ToDoListData.csv", true);
    for (ToDoList td : tdListMembers) {
      writer.write(td + System.getProperty("line.separator"));
    }
    writer.close();
  }
}
