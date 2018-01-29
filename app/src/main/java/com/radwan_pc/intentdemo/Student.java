package com.radwan_pc.intentdemo;

import java.io.Serializable;
import java.lang.annotation.Documented;

/**
 * Created by Radwan-PC on 29-Jan-18.
 */

public class Student implements Serializable{


    String studName;
    String studDepartment;
    int studID;
    Double studGrade;


    public Student(String studName, String studDepartment, int studID, Double studGrade) {
        this.studName = studName;
        this.studDepartment = studDepartment;
        this.studID = studID;
        this.studGrade = studGrade;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public String getStudDepartment() {
        return studDepartment;
    }

    public void setStudDepartment(String studDepartment) {
        this.studDepartment = studDepartment;
    }

    public int getStudID() {
        return studID;
    }

    public void setStudID(int studID) {
        this.studID = studID;
    }

    public Double getStudGrade() {
        return studGrade;
    }

    public void setStudGrade(Double studGrade) {
        this.studGrade = studGrade;
    }



}
