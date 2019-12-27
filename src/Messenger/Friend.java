package Messenger;

import Model.Normal_user;
import Model.User;

import java.util.ArrayList;

public class Friend {
    public static ArrayList<Normal_user> usersList = Normal_user.Users;
    public static ArrayList<Friend> friendlist = new ArrayList<>();

    public static boolean SearchFriend(String friendName)
    {
        for(int i=0; i< usersList.size(); i++)
        {
            if(friendName.equals(usersList.get(i)))
            {
                return true;
            }
        }
        return false;
    }

    public static boolean Add_friend(String friendname)
    {
        boolean searchResult = SearchFriend(friendname);
        if(!searchResult)
        {
            System.out.println("Friend not found!");
            return false;
        }else {
            System.out.println("Friend added successfully");
            return true;
        }
    }

    public static void Remove_friend(String friendname)
    {

    }

    public static void addinhisfriendlist()
    {

    }

    public static ArrayList<Friend> displayfriendlist()
    {
        return friendlist;
    }
}
