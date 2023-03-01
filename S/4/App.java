import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Node<String> n1 = new Node<>("1");
    Node<String> n2 = new Node<>("2");
    Node<String> n3 = new Node<>("3");
    Node<String> n4 = new Node<>("4");
    Node<String> n5 = new Node<>("5");
    Node<String> n6 = new Node<>("6");
    Node<String> n7 = new Node<>("7");
    Node<String> n8 = new Node<>("8");
    Node<String> n9 = new Node<>("9");
    Node<String> n10 = new Node<>("10");

    n1.append(n2);
    n2.append(n5);
    n5.append(n9);
    n5.append(n10);
    n1.append(n3);
    n3.append(n6);
    n3.append(n7);
    n3.append(n8);
    n1.append(n4);

    new Printer().preOrder(n1, "");
  }
}

class Printer {
  public <T> void preOrder(Node<T> root, String space) {
    if (root != null) {
      System.out.println(space + root.getValue());
      for (Node<T> subRoot : root.getNodes()) {
        preOrder(subRoot, space + "  ");
      }
    }
  }
}

class Node<T> {
  private T value;
  private ArrayList<Node<T>> nodes;

  public ArrayList<Node<T>> getNodes() {
    return nodes;
  }

  public void append(Node<T> item) {
    nodes.add(item);
  }

  public Node(T value) {
    this.value = value;
    this.nodes = new ArrayList<>();
  }

  public T getValue() {
    return value;
  }
}