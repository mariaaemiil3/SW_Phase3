package Model;

import java.util.ArrayList;

public class Normal_user extends User {

    public static ArrayList <Normal_user> Users = new ArrayList<>();
    String name;

    Normal_user()
    {
        name = User.Name;
        for(int i=0; i<User.db.size(); i++) {
            Users.add(User.db.get(i));
        }
    }

}
