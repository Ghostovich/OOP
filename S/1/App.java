import java.math.BigInteger;
import java.sql.Date;
import java.util.ArrayList;

/**
 * App
 */
public class App {
  public static void main(String[] args) {
    PeopleRepository peoples = new PeopleRepository();
    peoples.create(new People(0, "Вася 1", "10 02 2000", "статус 1"));
    peoples.create(new People(1, "Вася 11", "10 02 1990", "статус 2"));
    peoples.create(new People(2, "Петя 21", "10 02 1234", "статус 3"));
    peoples.create(new People(3, "Таня 1", "15 02 5654", "статус 4"));
    peoples.create(new People(4, "Николай 1", "05 02 5654", "статус 4"));

    AddressRepository addresses = new AddressRepository();
    addresses.create(new Address(0, "Мск", "Работа"));
    addresses.create(new Address(0, "Омск", "Дом"));
    addresses.create(new Address(0, "Томск", "Дача"));
    addresses.create(new Address(1, "Спб", "Описание 1мыв"));
    addresses.create(new Address(2, "Смол", "Описание мыфс1"));
    addresses.create(new Address(3, "Тула", "Описание 1сыфсф"));
    addresses.create(new Address(4, "Нефтеюганск", "Описание 1сыфсф"));

    Repo repo = new Repo(peoples, addresses);

    var res = repo.readCommonList();
    System.out.println(res);

  }
}

class People {
  public int id;
  public String fio;
  public String dayOfBirth;
  public String status;

  public People(int id, String fio, String dayOfBirth, String status) {
    this.id = id;
    this.fio = fio;
    this.dayOfBirth = dayOfBirth;
    this.status = status;
  }
}

class Telephone {
  public int whosePhone;
  public String phoneNumber;
  public String description;

  public Telephone(int whosePhone, String phoneNumber, String description) {
    this.whosePhone = whosePhone;
    this.phoneNumber = phoneNumber;
    this.description = description;
  }
}

class Address {
  public int whoseAddress;
  public String city;
  public String description;

  public Address(int whoseAddress, String city, String description) {
    this.whoseAddress = whoseAddress;
    this.city = city;
    this.description = description;
  }

  @Override
  public String toString() {

    return String.format("city: %s com: %s", city, description);
  }
}

class PeopleRepository {

  ArrayList<People> db = new ArrayList<>();

  /// TODO
  public ArrayList<People> getDb() {
    return db;// ???!!!!
  }

  void create(People current) {
    db.add(current);
  }

  People read(int id) {
    return db.get(id);
  }

  People read(String fl) {
    for (People people : db) {
      if (people.fio.equals(fl))
        return people;
    }
    return null;
  }
}

class AddressRepository {
  ArrayList<Address> db = new ArrayList<>();

  public ArrayList<Address> getDb() {
    return db;
  }

  void create(Address current) {
    db.add(current);
  }

  ArrayList<Address> read(int id) {
    ArrayList<Address> t = new ArrayList<>();

    for (Address address : db) {
      if (address.whoseAddress == id) {
        t.add(address);
      }
    }
    return t;
  }

}

class TelephoneRepository {

  void create(Telephone current) {

  }

  Telephone read() {
    // TODO Auto-generated method stub
    return null;
  }
}

class Repo {
  PeopleRepository pr;
  AddressRepository ar;

  public Repo(PeopleRepository pr, AddressRepository ar) {
    this.pr = pr;
    this.ar = ar;
  }

  StringBuilder readCommonList() {
    StringBuilder sb = new StringBuilder();

    for (People item : pr.getDb()) {
      sb.append(String.format("%s %s %s\n", item.fio, item.status, ar.read(item.id)));
    }

    return sb;
  }
}

class Worker {
  final int id;
  int salary;
  String fullName;

  public Worker(int id, int salary, String fullName) {
    this.id = id;
    this.salary = salary;
    this.fullName = fullName;
  }
}