package day13;

public class Test {
    public static void main(String[] args) {
        User user1 = new User("Piter");
        User user2 = new User("Bob");
        User user3 = new User("Dana");

        user1.sendMessage(user2,"Hello from Piter");
        user1.sendMessage(user2,"How are you");

        user2.sendMessage(user1,"Hi, Piter!");
        user2.sendMessage(user1,"I'm Bob. Nice to meet you!");
        user2.sendMessage(user1,"I'm fine, And you?");

        user3.sendMessage(user1,"Hey! My name is Dana");
        user3.sendMessage(user1,"Do you remember me?");
        user3.sendMessage(user1,"We went to the same school");

        user1.sendMessage(user3,"Hey, Dana. Of course, I remember you!");
        user1.sendMessage(user3,"So nice to see you again");
        user1.sendMessage(user3,"Let's meet up! Are you free tomorrow?");

        user3.sendMessage(user1,"Yep! I'm free tomorrow. Let's go!");

        MessageDatabase.showDialog(user1, user3);

        //System.out.println(MessageDatabase.getMessages());
    }
}
