package com.enrollment;

import java.util.Formatter;

public class Instructor {

    private long id;
    private String firstName;
    private String lastName;
    private String gender;
    private String title;

    public Instructor(){
        id = -1;
        firstName = null;
        lastName = null;
        gender = null;
        title = null;
    }

    public Instructor(long id, String firstName, String lastName, String gender, String title){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.title = title;
    }

    public long getID(){
        return id;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getGender(){
        return gender;
    }

    public String getTitle(){
        return title;
    }

    public void setID(long id){
        this.id = id;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastNmae(String lastName){
        this.lastName = lastName;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public void setTitle(String title){
        this.title = title;
    }
}
