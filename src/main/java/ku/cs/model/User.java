package ku.cs.model;

public class User {

    private String userName;
    private String userPassword;

    public User(String userName, String userPassword) {
        this.userName = userName;
        this.userPassword = userPassword;
    }

    public boolean checkUserName(String userName){
        return this.userName.equals(userName);
    }

    public boolean checkUserPassword(String userPassword){
        return this.userPassword.equals(userPassword);
    }
}
