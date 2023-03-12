public class ToDoListCreator {

  private static ToDoListCreator instance;

  public static ToDoListCreator getInstance() {
    if (instance == null)
      instance = new ToDoListCreator();
    instance.init();
    return instance;
  }

  private ToDoListCreator() {
  }

  private void init() {
    temp = new ToDoList();

    temp.dateAdd = null;
    temp.deadline = null;
    temp.name = null;
    temp.id = null;
    temp.priority = null;
    temp.action = null;

  }

  ToDoList temp;

  public ToDoListCreator setPriority(String priority) {
    temp.priority = priority;
    return this;
  }

  public ToDoListCreator setId(String id) {
    if (id != null)
      temp.id = id;
    else
      temp.id = "";
    return this;
  }

  public ToDoListCreator setName(String name) {
    temp.name = name;
    return this;
  }

  public ToDoListCreator setAction(String action) {
    temp.action = action;
    return this;
  }

  public ToDoList Create() {
    return temp;
  }

  public ToDoListCreator setDeadline(String deadline) {
    temp.deadline = deadline;
    return this;
  }

  public ToDoListCreator setDateAdd(String dateAdd) {
    temp.dateAdd = dateAdd;
    return this;
  }

}
