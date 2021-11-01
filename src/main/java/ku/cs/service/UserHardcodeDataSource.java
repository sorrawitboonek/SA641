package ku.cs.service;

import ku.cs.model.Customer;
import ku.cs.model.User;
import ku.cs.model.Userlist;

public class UserHardcodeDataSource {

    private Userlist users;

    public UserHardcodeDataSource() {
        this.users = new Userlist();
        hardcode();
    }

    private void hardcode() {
        users.addUser(new User("Admin","11111111"));
        users.addUser(new Customer("Customer1","11111111",
                "Customer 1","09x-xxx-xxxx","Customer1@Hotmail.com","11/11 Bangkok 11000"));
    }

    public Userlist readData(){
        return this.users;
    }

    public void writeData(Userlist users){
        this.users = users;
    }
}

