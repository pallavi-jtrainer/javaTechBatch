package com.sample.demo;

/**
 * student class.
 */
public class Student {
    private int studentId;
    private String studentName;
    private int age;

    /**
     * getter for age.
     * @return age int
     */
    public int getAge() {
        return age;
    }

    /**
     * getter for studentId.
     * @return studentId int
     */
    public int getStudentId() {
        return studentId;
    }

    /**
     * getter for studentName.
     * @return studentName String
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * setter for age.
     * @param age int
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * setter for studentId.
     * @param studentId int
     */
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    /**
     * setter for studentName.
     * @param studentName String
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    /**
     * default constructor
     */
    public Student() {

    }

    /**
     * parameterized constructor.
     * @param id studentId int
     * @param name studentName String
     * @param a age int
     */
    public Student(int id, String name, int a) {
        this.studentId = id;
        this.studentName = name;
        this.age = a;
    }

    /**
     * toString method.
     * @return String
     */
    @Override
    public String toString() {
        return "[Student: Id: " + this.studentId + ", Name: " + this.studentName
            + ", Age: " + this.age + "]";
    }
}
