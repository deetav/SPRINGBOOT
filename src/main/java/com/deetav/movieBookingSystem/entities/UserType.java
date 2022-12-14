package com.deetav.movieBookingSystem.entities;


import jakarta.persistence.*;

@Entity
public class UserType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userTypeID;

    @Column(length = 20, unique = true)
    private String userTypeName = "Customer";

    public UserType(){

    }

    public UserType(String userTypeName){
        this.userTypeName = userTypeName;
    }

    public int getUserTypeID() {
        return userTypeID;
    }

    public void setUserTypeID(int userTypeID) {
        this.userTypeID = userTypeID;
    }

    public String getUserTypeName() {
        return userTypeName;
    }

    public void setUserTypeName(String userTypeName) {
        this.userTypeName = userTypeName;
    }

    @Override
    public String toString() {
        return "UserType{" +
                "userTypeID=" + userTypeID +
                ", userTypeName='" + userTypeName + '\''  +
                '}';
    }
}
