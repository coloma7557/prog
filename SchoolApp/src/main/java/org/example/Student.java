package org.example;

import java.util.ArrayList;
import java.util.List;

public class Student {

    public enum genderKind{
        MALE , FEMALE
    }

    public String name;
    private long id;
    private int age;
    public genderKind gender;

    public Student(long id, String name, int age, genderKind gender){
        this.id = id;
        this.name = name;
        setAge(age);
        this.gender = gender;
    }
    public Student() {
    }

    public long getStudentId(){
        return this.id;
    }

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

}
