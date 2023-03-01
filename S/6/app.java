import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class app {

  public static void main(String[] args) {
    // ITree<Integer> root = new NewTree<Integer>();
    // root.getTree();

    Random random = new Random();
    Calc c = new Calc(new ServiceLogger().getLogger());

    System.out.println(c.sub(new Operand(random.nextInt(100)), new Operand(random.nextInt(100))));
    System.out.println(c.div(new Operand(random.nextInt(100)), new Operand(random.nextInt(100))));
    System.out.println(c.div(new Operand(0), new Operand(0)));
    System.out.println(c.sub(new Operand(random.nextInt(100)), new Operand(random.nextInt(100))));
    System.out.println(c.mult(new Operand(random.nextInt(100)), new Operand(random.nextInt(100))));

    // NumberNode n1 = new NumberNode(1);
    // NumberNode n11 = new NumberNode(2);
    // NumberNode n12 = new NumberNode(3);
    // NumberNode n111 = new NumberNode(4);
    // NumberNode n112 = new NumberNode(5);
    // NumberNode n121 = new NumberNode(6);
    // NumberNode n1211 = new NumberNode(7);
    // NumberNode n122 = new NumberNode(8);

    // n1.left = n11;
    // n1.right = n12;

    // n11.left = n111;
    // n11.right = n112;

    // n12.left = n121;
    // n12.right = n122;

    // n121.left = n1211;
    // StringBuilder sb = new StringBuilder();
    // new Printer().preOrder(n1, sb, " ", 0);
    // System.out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" + sb + "");
  }
}

class ServiceLogger {
  public ILogger getLogger() {
    Random r = new Random();
    if (r.nextInt(2) == 0)
      return new TrueLogger();
    else
      return null;
  }

}

class Printer {
  String getTitleBy(int value) {
    if (value == 0) {
      return "root";
    } else if (value == 1) {
      return "left";
    } else if (value == 2) {
      return "right";
    } else {
      return "";
    }
  }

  void preOrder(NumberNode root, StringBuilder sb, String space, int n) {
    if (root != null) {
      sb.append(String.format("%s<node value='%d' description='%s'>\n", space, root.value, getTitleBy(n)));
      if (root.left != null)
        preOrder(root.left, sb, space + "  ", 1);
      if (root.right != null)
        preOrder(root.right, sb, space + "  ", 2);

      sb.append(space + "</node>\n");
    }
  }
}

class NumberNode {
  int value;

  public NumberNode(int value) {
    this.value = value;
  }

  NumberNode left;
  NumberNode right;
}

class TrueLogger implements ILogger {
  @Override
  public void log(IDataLogger model) {

    try (FileWriter writer = new FileWriter("log.csv", true)) {

      writer.write(LocalDate.now() + ";");
      writer.write(model.getMessage() + ";");
      writer.write(model.getErrorCode() + ";");
      writer.write(model.getTag() == null ? "-;" : model.getTag() + ";");
      writer.append('\n');

    } catch (IOException ex) {
    }
  }
}

@Deprecated
class ThisBestLogger implements ILogger {
  @Override
  public void log(IDataLogger model) {

    try (FileWriter writer = new FileWriter("log.log", true)) {

      writer.write(LocalDate.now() + ": ");
      writer.write(model.getMessage());

      writer.append('\n');

    } catch (IOException ex) {
    }
  }
}

interface IDataLogger {
  String getMessage();

  Integer getErrorCode();

  Object getTag();
}

class DataLogger implements IDataLogger {

  String message;
  int errorCode;
  Object tag;

  public DataLogger(String message, int errorCode, Object tag) {
    this.message = message;
    this.errorCode = errorCode;
    this.tag = tag;
  }

  public DataLogger(String message, int errorCode) {
    this(message, errorCode, null);
  }

  public DataLogger(String message) {
    this(message, 0, null);
  }

  @Override
  public String getMessage() {
    return message;
  }

  @Override
  public Integer getErrorCode() {
    return errorCode;
  }

  @Override
  public Object getTag() {
    return tag;
  }
}

interface ILogger {
  void log(IDataLogger model);
}

class Operand {
  Integer value;

  public Operand(Integer value) {
    this.value = value;
  }

}

class Calc {

  private ILogger logger;

  public void setLogger(ILogger logger) {
    this.logger = logger;
  }

  public Calc(ILogger logger) {
    this.logger = logger;
  }

  Integer sum(Operand op1, Operand op2) {
    Integer result = op1.value + op2.value;
    logger.log(new DataLogger(String.format("%d + %d = %d", op1.value, op2.value, result)));
    return result;
  }

  Integer div(Operand op1, Operand op2) {

    if (op2.value == 0) {
      logger.log(new DataLogger("Плохое деление", 100500, "Как чинить: https://google.com"));
      return 0;
    }

    Integer result = op1.value / op2.value;
    logger.log(new DataLogger(String.format("%d / %d = %d", op1.value, op2.value, result)));
    return result;
  }

  Integer mult(Operand op1, Operand op2) {
    Integer result = op1.value * op2.value;
    logger.log(new DataLogger(String.format("%d * %d = %d", op1.value, op2.value, result)));
    return result;
  }

  Integer sub(Operand op1, Operand op2) {
    Integer result = op1.value - op2.value;
    logger.log(new DataLogger(String.format("%d - %d = %d", op1.value, op2.value, result)));
    return result;
  }
}

/// ========
class Node<T> {
  T value;

  public Node(T value) {
    this.value = value;
  }

  Node<T> left;
  Node<T> right;
}

interface ITree<T> {
  List<Node<T>> getTree();
}

class NewTree<T> implements ITree<T> {

  LinkedList<Node<T>> storage;

  public NewTree() {
    storage = new LinkedList<>();
  }

  @Override
  public List<Node<T>> getTree() {
    return storage;
  }

  void addChild(T value) {
    storage.add(new Node<T>(value));
  }
}
