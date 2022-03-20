package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Mark");
        User user2 = new User("Anton");
        User user3 = new User("Anna");

        user1.sendMessage(user2, "Привет!");
        user1.sendMessage(user2, "Как дела?");

        user2.sendMessage(user1, "И тебе привет.");
        user2.sendMessage(user1, "Все хорошо");
        user2.sendMessage(user1, "Как у тебя?");

        user3.sendMessage(user1, "Приветики!");
        user3.sendMessage(user1, "Как делища?");
        user3.sendMessage(user1, "Чем занимаешься?");

        user1.sendMessage(user3, "Все норм!");
        user1.sendMessage(user3, "Я на работе.");
        user1.sendMessage(user3, "Потом напишу.");

        user3.sendMessage(user1, "Ок");

        MessageDatabase.showDialog(user1, user2);

    }
}
