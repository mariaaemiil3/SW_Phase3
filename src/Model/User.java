package Model;

import Messenger.Friend;

import java.util.ArrayList;
import java.util.Scanner;

public class User {
    public static String Name, Email, Address,Country,Gender,DateOfBirth;
    public static long Phone;
    private static String Password;
    public static ArrayList <User> db = new ArrayList<>();
    public static Friend f = new Friend();

    public static boolean AcceptFriendReq(boolean response)
    {
        if(response == true)
        {
            f.addinhisfriendlist();
            return true;
        }else{
            return false;
        }
    }

    public static void change_name(String name)
    {

    }

    public static void change_photo()
    {

    }

    public static void Logout()
    {

    }

    public static void searchresults()
    {

    }

    public static boolean login(String name,String password)
    {
        for(int i=0; i<db.size(); i++)
        {
            if(!name.equals(db.get(i).Email) || !name.equals(db.get(i).Name))
            {
                return false;
            }
            else{
                if(!password.equals(db.get(i).Password))
                {
                    return false;
                }
            }
        }
        return true;
    }

    public static void register(String name,String password,String email,String gender,String country,String dateOfBirth)
    {
        Scanner in = new Scanner(System.in);
        boolean valid = false;
        String splitt[] = new String[4];

        Name = name;
        while(password.length() < 8 && (!password.contains("1") || !password.contains("2") || !password.contains("3") || !password.contains("4")
         || !password.contains("5") || !password.contains("6") || !password.contains("7") || !password.contains("8") || !password.contains("9")))
        {
            System.out.println("Please enter a password of 8 characters or more and must contains at least 1 number");
            password = in.next();
        }
        Password = password;
        valid = checkValidEmail(email);
        while(!email.contains("@") || !valid)
        {
            System.out.println("Please enter a valid email");
            email = in.next();
        }
        Email = email;
        while(gender != "male" || gender != "female")
        {
            System.out.println("Please enter a valid gender");
            gender = in.next();
        }
        Gender = gender;
        Country = country;
        splitt = dateOfBirth.split("/");
        while(splitt.length > 3){
            System.out.println("Please enter a valid birth date");
            dateOfBirth = in.next();
            splitt = dateOfBirth.split("/");
        }
        DateOfBirth = dateOfBirth;
    }

    private static boolean checkValidEmail(String Email) {
        for(int i=0; i<db.size(); i++)
        {
            if(Email.equals(db.get(i).Email))
            {
                return true;
            }
        }
        return false;
    }

    public static void search(String searchedstring)
    {

    }
    public static void main(String[] args) {
	// write your code here
    }
}
