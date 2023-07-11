package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String nameUser;
    private List<User> subscriptions;

    public User(String nameUser) {
        this.nameUser = nameUser;
        this.subscriptions = new ArrayList<>();
    }

    public String getNameUser() {
        return nameUser;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user) {
        this.subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {
        for (User x: getSubscriptions()) if (x.getNameUser().equals(user.getNameUser())) return true;
        return false;
    }

    public boolean isFriend(User user) {
        return this.isSubscribed(user) && user.isSubscribed(this);
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.sendMessage(this,user,text);
    }

    public String toString() {
        return nameUser;
    }

}
