package com.example.remindmeapp.services;

import com.example.remindmeapp.entity.Reminder;
import com.example.remindmeapp.repository.ReminderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class ReminderDaoService {

    private static HashMap<Integer, HashMap<Integer,Reminder>> remindersMap = new HashMap<>();


    static{
        HashMap<Integer,Reminder> hm = new HashMap<>();
        hm.put(1,new Reminder(1,"My Birthday", "Today is Birthday of Ashwin", 1, new Date()));
        hm.put(2,new Reminder(2,"Term insurance premium", "pay hdfc term insurance premium", 1,new Date()));
        hm.put(3,new Reminder(3,"Bike insurance premium", "pay bajaj bike insurance premium", 1,new Date()));
        remindersMap.put(1,hm);
        hm= new HashMap<>();
        hm.put(11,new Reminder(11,"My Birthday", "Today is Birthday of Ashitha",2, new Date()));
        hm.put(12,new Reminder(12,"LIC premium", "pay LIC premium of Ashitha", 2,new Date()));
        remindersMap.put(2,hm);

    }

@Autowired
    public ReminderRepository reminderRepository;
    public void createReminder(Reminder reminder){
        reminderRepository.save(reminder);
    }


    public Optional<Reminder> getReminder(Integer reminderId){
        Optional<Reminder> reminder=reminderRepository.findById(reminderId);
        return reminder;
    }

    public List<Reminder> getAllRemindersForUser(Integer userId){
        List<Reminder> reminderList =reminderRepository.findAllByUserId(userId);
        return reminderList;
    }

    public void updateReminder(Reminder reminder){
        reminderRepository.save(reminder);
    }

    public void deleteReminder(Integer reminderId){
        reminderRepository.deleteById(reminderId);

    }

    public void deleteReminders(Integer userId){
        throw new UnsupportedOperationException("Deleting all reminders for an user is currently not supported");
    }
}
