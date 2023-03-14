package rational;

import java.io.IOException;
import java.util.Scanner;

public class RationalMenu {
  public static Scanner input = new Scanner(System.in);

  public static void rationalMenu(String text) throws IOException {
    System.out.println(text);
    System.out.print("Ввод: ");
    Integer num = input.nextInt();
    System.out.println();

    if (num == 1) {
      Rational rat = new Rational(1, 3);
      Rational.Multiplication(rat);
    }

    if (num == 2) {
    }

    if (num == 3) {
    }

    if (num == 4) {
    }
  }
}
