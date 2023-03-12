import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class FamilyScanner {
    public static Scanner input = new Scanner(System.in);

    public static void familyScanner(String text, List<Family> familyMembers) throws IOException {
        System.out.println(text);
        System.out.print("Ввод: ");
        Integer num = input.nextInt();
        System.out.println();

        if (num == 1) {
            System.out.print("Введите статус элемента: ");
            String status = input.next();
            System.out.print("Введите имя элемента: ");
            String name = input.next();
            System.out.print("Введите дату рождения элемента через точку: ");
            String date = input.next();
            String element = status + " " + name + " " + date;
            // familyMembers.add(element);
            System.out.println(element);
            System.out.println("Элемент добавлен");
        }

        if (num == 2) {
            FamilyPrinter.familyPrinter(familyMembers);
        }

        if (num == 3) {
            FamilyImport.familyImport();
        }

        if (num == 3) {
            FamilyExport.familyExport(familyMembers);
        }
    }
}
