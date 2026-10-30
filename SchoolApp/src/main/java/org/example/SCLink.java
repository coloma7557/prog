package org.example;

public class SCLink {

    private long studentId;
    private long classroomId;

    public SCLink() {
    }

    public SCLink(long studentId, long classroomId) {
        this.studentId = studentId;
        this.classroomId = classroomId;
    }

    public long getStudentId() {
        return this.studentId;
    }

    public long getClassroomId() {
        return this.classroomId;
    }
}
