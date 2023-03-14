import java.io.IOException;
import java.util.Scanner;

import complex.CoplexMenu;
import rational.RationalMenu;

public class Menu {
  public static Scanner input = new Scanner(System.in);

  public static void menu(String text) throws IOException {
    System.out.println(text);
    System.out.print("Ввод: ");
    Integer num = input.nextInt();
    System.out.println();

    if (num == 1) {
      RationalMenu.rationalMenu("Выберите действие: \n 1 - сложение\n 2 - вычетание \n 3 - умножение \n 4 - деление");
    }

    if (num == 2) {
      Import.toDoListImport();

      CoplexMenu.complexMenu("Выберите действие: \n 1 - сложение\n 2 - вычетание \n 3 - умножение \n 4 - деление");
    }
  }
}
