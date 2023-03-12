import java.time.LocalDate;

class Family {
  public String id;
  public String name;
  public LocalDate dayOfBirth;
  public String status;
  public String sex;

  public String toString() {
    return String.format("%s %s %s",
        status,
        name,
        dayOfBirth);
  }
}
