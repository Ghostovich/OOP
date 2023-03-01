import java.util.ArrayList;

/**
 * App
 */
public class App2 {

  public static void main(String[] args) {
    TeleChat chat = new TeleChat();
    User client1 = new User("Вася", chat);
    User client2 = new User("Маша", chat);
    User client4 = new User("Вальдемар", chat);
    chat.appendClient(client1);
    chat.appendClient(client2);
    chat.appendClient(client4);
    client1.sendMsg("привет всем!");
    client2.sendMsg("ку-ку!");
    User client3 = new User("Коля", chat);
    chat.appendClient(client3);

    client3.sendMsg("hello world!");
  }
}

interface Chat {
  void sendMessage(String msg, User user);

  void appendClient(User user);
}

class User {
  public User(String name, Chat chatroom) {
    this.name = name;
    this.chatroom = chatroom;
  }

  String name;
  private Chat chatroom;

  void printMessage(String msg) {
    System.out.printf("Чат %s: %s\n", name, msg);
  }

  void sendMsg(String text) {
    chatroom.sendMessage(text, this);
  }
}

class TeleChat implements Chat {

  ArrayList<User> users = new ArrayList<>();

  @Override
  public void sendMessage(String text, User me) {

    for (User user : users) {
      if (user.name != me.name) {
        user.printMessage(text);
      }
    }
  }

  @Override
  public void appendClient(User client) {
    System.out.println("\n >>> добавился " + client.name);
    users.add(client);

  }
}
