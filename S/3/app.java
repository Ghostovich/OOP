/**
 * app
 */
public class app {

  public static void main(String[] args) {
    System.out.println(f(2, 2222, 1, 2));
  }

  static int f(int a, int b, int k1, int k2) {
    if (b <= a) {
      return 1;
    } else if (b % k2 != 0) {
      return f(a, b - k1, k1, k2);
    } else if (b % k2 == 0) {
      return f(a, b / k2, k1, k2) + f(a, b - k1, k1, k2);
    } else {
      return 0;
    }
  }
}