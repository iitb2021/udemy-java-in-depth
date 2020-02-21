package com.iitb2021.basics.demo10;


class User{
    int id;
    String name;
    int salary;

    User(int userId, String userName){
        id = userId;
        name = userName;
    }

  //  String testName;

    User(int userId, String userName, int userSalary){
        this(userId,userName);
       // this(userId,userName);                [ Error : call to this must be first statement in constructor]
       // this(userId,userName,userSalary);     [ Error : recursive constructor invocation]
        salary = userSalary;
       // this(userId,userName);                [ Error : call to this must be first statement in constructor]
       //  this(userId,testName);               [ Error : cannot reference testName before supertype constructor has been called]



    }
}
public class BasicsDemo {

    public static void main(String[] args) {
        User instructor = new User(1002,"Ravee", 50000);
        System.out.println("Name: "+instructor.name);
    }

}
