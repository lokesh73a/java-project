package edu.ccrm.domain;

import java.time.LocalDate;

public class Student extends Person {
    private String regNo;
    private StudentStatus status;
    private LocalDate enrollmentDate;

    public Student(String fullName, String email, String regNo) {
        super(fullName, email);
        this.regNo = regNo;
        this.status = StudentStatus.ACTIVE;
        this.enrollmentDate = LocalDate.now();
    }

    @Override
    public String getProfile() {
        return "Student Profile: " + this.fullName + " (" + this.regNo + ")";
    }

    @Override
    public String toString() {
        return "Student[\n" +
               "  Name: " + fullName + ",\n" +
               "  Reg No: " + regNo + ",\n" +
               "  Email: " + email + ",\n" +
               "  Status: " + status + ",\n" +
               "  Enrolled On: " + enrollmentDate + "\n" +
               "]";
    }
}

enum StudentStatus {
    ACTIVE, INACTIVE, GRADUATED
}