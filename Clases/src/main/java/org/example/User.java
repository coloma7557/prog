package org.example;

public class User {

    public String name;
    public long id;
    private int age;
    private int gender;

    public void setAge(int age){
        if(age <= 0)
            return;
        if(age > 200)
            return;
        this.age = age;
    }
}
