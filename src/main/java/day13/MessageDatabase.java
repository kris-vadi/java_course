package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static List<Message> messages = new ArrayList<>();

    public static void addNewMessage(User u1, User u2, String text) {
        Message message = new Message(u1,u2,text);
        messages.add(message);
    }

    public static List<Message> getMessages() {
        return messages;
    }

    public static void showDialog(User u1, User u2) {
        for (Message m: messages) {
            if ((m.getSender().equals(u1) && m.getReceiver().equals(u2)) || (m.getSender().equals(u2) && m.getReceiver().equals(u1))) {
                System.out.println(m.getSender() + ": " + m.getText());
            }
        }
    }
}
