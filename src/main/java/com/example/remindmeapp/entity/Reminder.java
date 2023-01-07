package com.example.remindmeapp.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="reminder")
public class Reminder {
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    private String name;
    private String description;
    private Integer userId;
    private Date scheduledDate;


    public Reminder(Integer id, String name, String description, Integer userId, Date scheduledDate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.scheduledDate = scheduledDate;
        this.userId=userId;
    }

    public Reminder() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getScheduledDate() {
        return scheduledDate;
    }

    public void setScheduledDate(Date date) {
        this.scheduledDate = date;
    }

    @Override
    public String toString() {
        return "Reminder{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", userId=" + userId +
                ", scheduledDate=" + scheduledDate +
                '}';
    }

}
