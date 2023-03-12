class ToDoList {
  public String id;
  public String name;
  public String action;
  public String dateAdd;
  public String deadline;
  public String priority;

  public String toString() {
    return String.format("Задача: %s, приоритет - %s, добавил %s %s, срок до %s",
        action,
        priority,
        name,
        dateAdd,
        deadline);
  }
}
