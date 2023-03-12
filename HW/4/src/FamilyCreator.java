import java.time.LocalDate;

public class FamilyCreator {

  private static FamilyCreator instance;

  public static FamilyCreator getInstance() {
    if (instance == null)
      instance = new FamilyCreator();
    instance.init();
    return instance;
  }

  private FamilyCreator() {
  }

  private void init() {
    temp = new Family();

    temp.dayOfBirth = LocalDate.of(1969, 1, 12);
    temp.name = "";
    temp.id = "";
    temp.status = "";
    temp.sex = "";
  }

  Family temp;

  public FamilyCreator setSex(String sex) {
    temp.sex = sex;
    return this;
  }

  public FamilyCreator setDay(LocalDate ofBirth) {
    temp.dayOfBirth = ofBirth;
    return this;
  }

  public FamilyCreator setId(String id) {
    if (id != null)
      temp.id = id;
    else
      temp.id = "";
    return this;
  }

  public FamilyCreator setName(String name) {
    temp.name = name;
    return this;
  }

  public FamilyCreator setStatus(String status) {
    temp.status = status;
    return this;
  }

  public Family Create() {
    return temp;
  }

  public FamilyCreator setDay(int day, int month, int year) {
    return null;
  }

}
