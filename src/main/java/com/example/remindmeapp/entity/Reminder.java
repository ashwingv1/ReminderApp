package com.example.remindmeapp.entity;

import java.util.Date;

public class Reminder {

    private Integer Id;
    private String Name;
    private String Description;
    private Integer userId;
    private Date date;


    public Reminder(Integer id, String name, String description, Integer userId, Date date) {
        Id = id;
        Name = name;
        Description = description;
        this.date = date;
        this.userId=userId;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
