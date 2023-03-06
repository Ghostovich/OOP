class Family {
  public String id;
  public String name;
  public String dayOfBirth;
  public String status;

  public String toString() {
    return String.format("%s %s %s",
        status,
        name,
        dayOfBirth);
  }
}
