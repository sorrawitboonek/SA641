package ku.cs.model;

import java.util.ArrayList;

public class Userlist {

    private ArrayList<User> users;
    private User user ;

    public Userlist() {
        users = new ArrayList<>();
    }

    public void addUser(User user){
        users.add(user);
    }

    public User getUser() {
        return user;
    }

    public boolean login(String username, String password){
        for(User user: users){
            if(user.checkUserName(username) && user.checkUserPassword(password)){
                this.user = user;
                return true;
            }
        }user = null;
        return false;
    }
}
