package com.radwan_pc.intentdemo;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Radwan-PC on 29-Jan-18.
 */

public class Person implements Parcelable {

    String firstName;
    String job;
    int age;


    public Person(Parcel parcel) {
        this.firstName = parcel.readString();
        this.job = parcel.readString();
        this.age = parcel.readInt();
    }

    public Person(String firstName, String job, int age) {
        this.firstName = firstName;
        this.job = job;
        this.age = age;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {

        parcel.writeString(this.firstName);
        parcel.writeString(this.job);
        parcel.writeInt(this.age);
    }

    public static final Creator<Person> CREATOR=new Creator<Person>() {
        @Override
        public Person createFromParcel(Parcel parcel) {
            return new Person(parcel);
        }

        @Override
        public Person[] newArray(int i) {
            return new Person[i];
        }
    };



    public String getFirstName() {
        return firstName;
    }

    public String getJob() {
        return job;
    }

    public int getAge() {
        return age;
    }

}
