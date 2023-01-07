package com.example.remindmeapp.controllers;

import com.example.remindmeapp.entity.Reminder;
import com.example.remindmeapp.services.ReminderDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController()
public class RemindersController {
    @Autowired
    ReminderDaoService reminderDaoService;

    @PostMapping(path = "/reminder")
    public void createReminder(@RequestBody Reminder reminder){
        reminderDaoService.createReminder(reminder);
    }

    @GetMapping(path="/reminder/{reminderId}")
    public Reminder getReminder(@PathVariable int reminderId){
        return reminderDaoService.getReminder(reminderId).get();
    }

    @GetMapping(path="/reminders/{userId}")
    public List<Reminder> getAllRemindersForUser(@PathVariable Integer userId){
        return reminderDaoService.getAllRemindersForUser(userId);
    }

    @PutMapping(path="/reminder")
    public void updateReminder(@RequestBody Reminder reminder){
        reminderDaoService.updateReminder(reminder);
    }

    @DeleteMapping(path="reminder/{reminderId}")
    public void deleteReminder(@PathVariable Integer reminderId){
            reminderDaoService.deleteReminder(reminderId);
    }

    @DeleteMapping(path="reminders/{userId}")
    public void deleteReminders(@PathVariable Integer userId){
        reminderDaoService.deleteReminders(userId);
    }

    }
