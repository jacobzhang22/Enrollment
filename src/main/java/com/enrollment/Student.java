package com.enrollment;

public class Student {
    private long id;
    private String firstName;
    private String lastName;
    private String gender;
    private int birthYear;
    private java.time.LocalDate birthDate;

    public Student() {
        id = -1;
        firstName = null;
        lastName = null;
        gender = null;
        birthYear = -1;
        birthDate = null;
    }

    public Student(long id, String firstName, String lastName, String gender, int birthYear, java.time.LocalDate birthDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthYear = birthYear;
        this.birthDate = birthDate;
    }

    public long getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public java.time.LocalDate getBirthDate() {
        return birthDate;
    }

    public void setID(long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setBirthDate(java.time.LocalDate birthDate) {
        this.birthDate = birthDate;
    }

}
