import java.util.Scanner;

public class Menu {
  public static Scanner input = new Scanner(System.in);

  public static void menu(String text) {
    Calc c = new Calc(new Logger());

    System.out.println(text);
    System.out.print("Ввод: ");
    Integer num = input.nextInt();
    System.out.println();

    System.out.print("Введите A: ");
    Integer num1 = input.nextInt();
    System.out.print("Введите B: ");
    Integer num2 = input.nextInt();


    if (num == 1) {
      System.out.println("Результат: " + c.sum(new Operand(num1), new Operand(num2)));
    }
    if (num == 2) {
      System.out.println("Результат: " + c.sub(new Operand(num1), new Operand(num2)));
    }
    if (num == 3) {
      System.out.println("Результат: " + c.mult(new Operand(num1), new Operand(num2)));
    }
    if (num == 4) {
      System.out.println("Результат: " + c.div(new Operand(num1), new Operand(num2)));
    }
  }
}
