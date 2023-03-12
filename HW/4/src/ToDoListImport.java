import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ToDoListImport {
  public static void toDoListImport() throws IOException {
    File f = new File("HW/4/src/ToDoListData.csv");
    try (BufferedReader fin = new BufferedReader(new FileReader(f))) {
      String line;
      while ((line = fin.readLine()) != null)
        System.out.println(line);
    }
  }
}
