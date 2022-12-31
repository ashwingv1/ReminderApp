package com.example.remindmeapp.services;

import com.example.remindmeapp.entity.Reminder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

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

    public void createReminder(Reminder reminder){
        HashMap<Integer,Reminder> hm;
        if(remindersMap.containsKey(reminder.getUserId()))
            hm=remindersMap.get(reminder.getUserId());
        else
            hm = new HashMap<>();
        hm.put(reminder.getId(), reminder);
        remindersMap.put(reminder.getUserId(),hm);
        System.out.println("Reminder " + reminder.getName() + "created for the user id:"+reminder.getUserId());
    }


    public Reminder getReminder(Integer reminderId){
        Reminder reminder=null;
        for(HashMap<Integer,Reminder> hm : remindersMap.values()){
            if(hm.containsKey(reminderId)){
                reminder=hm.get(reminderId);
                break;
            }
        }
        return reminder;
    }

    public List<Reminder> getAllRemindersForUser(Integer userId){
        List<Reminder> reminderList = new ArrayList<>();
        if(remindersMap.containsKey(userId)){
            reminderList=remindersMap.get(userId).values().stream().toList();
        }
        return reminderList;
    }

    public void updateReminder(Reminder reminder){
        createReminder(reminder);
    }

    public void deleteReminder(Integer reminderId){
        for(HashMap<Integer,Reminder> hm : remindersMap.values()){
            if(hm.containsKey(reminderId)){
                hm.remove(reminderId);
                break;
            }
        }
    }

    public void deleteReminders(Integer userId){
            if(remindersMap.containsKey(userId)){
                remindersMap.remove(userId);
            }
    }
}
