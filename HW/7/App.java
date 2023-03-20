// Заставить работать. (помним про SOLID)

public class App {

  public static void main(String[] args) {
    new InnerA(null).print();
  }
}

interface IInterface {
  void print();
}

class Innerapp implements IInterface {
  IInterface v;

  public Innerapp(IInterface v) {
    this.v = v;
  }

  void write() {
    v.print();
  }

  @Override
  public void print() {
    System.out.println("Work");
  }

}

class InnerA extends Innerapp {
  public InnerA(IInterface v) {
    super(v);
  }

  @Override
  public void print() {
    System.out.println("Work");
  }
}
