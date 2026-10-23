package org.example;

import java.util.ArrayList;
import java.util.List;

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

    public int getAge(){
        return this.age;
    }

    public void setGender(int gender){
        if(gender == 0 || gender == 1)
            return;
        this.gender = gender;
    }
}
