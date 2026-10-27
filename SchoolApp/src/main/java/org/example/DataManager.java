package org.example;

import java.util.ArrayList;
import java.util.List;

public class DataManager {

    private List<Student> StudentList;
    private List<Classroom> ClassroomList;
    private List<SCLink> SCLinkList;
    private long studentIdGen;
    private long classroomIdGen;

    //Inicializamos la clase creando la lista vacía
    public DataManager(){
        this.StudentList = new ArrayList<>();
        this.ClassroomList = new ArrayList<>();
        this.SCLinkList = new ArrayList<>();
        this.studentIdGen = 1;
        this.classroomIdGen = 1;
    }

    private long generateStudentId(){
        long newStudentId = this.studentIdGen;
        this.studentIdGen +=1;
        return newStudentId;
    }

    private long generateClassroomId(){
        long newClassroomId = this.classroomIdGen;
        this.classroomIdGen +=1;
        return newClassroomId;
    }

    //Student

    public void addStudent(Student student){
        this.StudentList.add(student);
    }

    public Student getStudent(long id){

        if(id == 0)
            return null;
        if(this.StudentList == null)
            return null;

        for(int i = 0; i < this.StudentList.size(); i++){
            Student s = this.StudentList.get(i);
            if(s.getStudentId() == id){
                return s;
            }
        }
        return null;
    }

    public Student getStudents(String namePattern){

    }

    public int indexOfStudent(Student student){

        for(int i = 0; i < this.StudentList.size(); i++){
            Student s = this.StudentList.get(i);
            if(s.getStudentId() == student.getStudentId())
                return i;
        }
        return -1;
    }

    public boolean removeStudent(long id){
        Student s = this.getStudent(id);
        if(s != null){
            int index = this.indexOfStudent(s);
            this.StudentList.remove(index);
            return true;
        }
        return false;
    }

    public

}
