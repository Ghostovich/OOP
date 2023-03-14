import java.io.IOException;

// Создать калькулятор для работы с рациональными и комплексными числами,
// организовать меню, добавив в неё систему логирования.

public class App {
  public static void main(String[] args) throws IOException {
    Menu.menu("Выберите тип чисел: \n 1 - рациональные\n 2 - комплексные");
  }
}
