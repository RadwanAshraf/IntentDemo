package com.radwan_pc.intentdemo;

import java.io.Serializable;
import java.lang.annotation.Documented;

/**
 * Created by Radwan-PC on 29-Jan-18.
 */

public class Student implements Serializable{


    private String studName;
    private String studDepartment;
    private int studID;
    private Double studGrade;


    public Student(String studName, String studDepartment, int studID, Double studGrade) {
        this.studName = studName;
        this.studDepartment = studDepartment;
        this.studID = studID;
        this.studGrade = studGrade;
    }

    public String getStudName() {
        return studName;
    }

    public String getStudDepartment() {
        return studDepartment;
    }

    public int getStudID() {
        return studID;
    }

    public Double getStudGrade() {
        return studGrade;
    }

}
