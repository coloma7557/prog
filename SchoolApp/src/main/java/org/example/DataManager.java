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
        if(student != null){
            Student safeStudent = new Student(
                this.generateStudentId(),
                student.name,
                student.getAge(),
                student.gender);
            this.StudentList.add(safeStudent);
        }
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

//    public Student getStudents(String namePattern){
//
//        for(int i = 0; i < this.StudentList.size(); i++){
//            Student s = this.StudentList.get(i);
//
//        }
//
//
//    }

    private int indexOfStudent(long id){

        for(int i = 0; i < this.StudentList.size(); i++){
            Student s = this.StudentList.get(i);
            if(s.getStudentId() == id)
                return i;
        }
        return -1;
    }

    public boolean removeStudent(long id){
        int index = this.indexOfStudent(id);
        if(index != -1){
            this.StudentList.remove(index);
            return true;
        }
        return false;
    }

    public void updateStudent(Student student){
        if (student != null && student.name != null && !student.name.trim().isEmpty()){
            Student safeStudent = new Student(
                    student.getStudentId(),
                    student.name,
                    student.getAge(),
                    student.gender);
            int index = indexOfStudent(student.getStudentId());
            if (index != -1) {
                StudentList.set(index, safeStudent);
            }
        }
    }

    //Classroom

    public void addClassroom(Classroom classroom){
        if(classroom != null){
            Classroom safeClassroom = new Classroom(
                    this.generateClassroomId(),
                    classroom.name,
                    classroom.location);
            this.ClassroomList.add(safeClassroom);
        }
    }

    public Classroom getClassroom(long id){
        if(id == 0)
            return null;
        if(this.ClassroomList == null)
            return null;

        for(int i = 0; i < this.ClassroomList.size(); i++){
            Classroom c = this.ClassroomList.get(i);
            if(c.getClassroomId() == id){
                return c;
            }
        }
        return null;
    }

//    public Classroom getClassrooms(){}

    private int indexOfClassroom(long id){

        for(int i = 0; i < this.ClassroomList.size(); i++){
            Classroom c = this.ClassroomList.get(i);
            if(c.getClassroomId() == id)
                return i;
        }
        return -1;
    }

    public void updateClassroom(Classroom classroom) {
        if (classroom != null && classroom.name != null && !classroom.name.trim().isEmpty()) {
            Classroom safeClassroom = new Classroom(
                    classroom.getClassroomId(),
                    classroom.name,
                    classroom.location
            );
            int index = indexOfClassroom(classroom.getClassroomId());
            if (index != -1) {
                ClassroomList.set(index, safeClassroom);
            }
        }
    }

    public boolean removeClassroom(long id){
        int index = this.indexOfClassroom(id);
        //Comprobar si ese estudiante tiene algún link
        if(index != -1){
            this.ClassroomList.remove(index);
            return true;
        }
        return false;
    }

    //Links

    private void addLink(long studentId, long classroomId){
        if(getStudent(studentId) == null || getClassroom(classroomId) == null){
            return;
        }
        for(int i = 0; i < this.SCLinkList.size(); i++){
            SCLink linkExist = this.SCLinkList.get(i);
            if(linkExist.getStudentId() == studentId && linkExist.getClassroomId() == classroomId){
                return;
            }
        }

        SCLink newLink = new SCLink(studentId, classroomId);
        this.SCLinkList.add(newLink);
    }

    private void removeLink(long studentId, long classroomId) {
        if (getStudent(studentId) == null || getClassroom(classroomId) == null) {
            return;
        }

        for (int i = 0; i < this.SCLinkList.size(); i++) {
            SCLink deleteLink = this.SCLinkList.get(i);
            if (deleteLink.getStudentId() == studentId && deleteLink.getClassroomId() == classroomId) {
                this.SCLinkList.remove(deleteLink);
                return;
            }
        }
    }
    public List<SCLink> getLinks(){
        return new ArrayList<>(this.SCLinkList);
    }
}
