import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FamilyImport {
  public static void familyImport() throws IOException {
    FileReader reader = new FileReader("notes3.txt");

    char[] buf = new char[256];
    int c = reader.read(buf);
    while (c > 0) {
      if (c < 256) {
        buf = Arrays.copyOf(buf, c);
      }
    }
  }
}
