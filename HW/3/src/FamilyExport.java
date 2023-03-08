import java.io.FileWriter;
import java.util.List;

import com.sun.tools.javac.Main;

public class FamilyExport {
  public static void familyExport(List<Family> familyMembers) {
    FileWriter writer = new FileWriter("notes.txt", true);
    for (int i = 0; i < familyMembers.size(); i++) {
      writer.write(familyMembers.get(i));
    }
  }
}
