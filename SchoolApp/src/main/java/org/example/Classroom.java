package org.example;

public class Classroom {

    public String name;
    private long id;
    public String location;

    public Classroom(long id, String name,String location){
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public Classroom() {
    }

    public long getClassroomId(){
        return this.id;
    }
}
