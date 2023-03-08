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

    temp.dayOfBirth = "";
    temp.name = "";
    temp.id = "";
    temp.status = "";
  }

  Family temp;

  public FamilyCreator setDay(String ofBirth) {
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
}
