package com.example.remindmeapp.repository;

import com.example.remindmeapp.entity.Reminder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ReminderRepository extends CrudRepository<Reminder,Integer> {
    Optional<Reminder> findById(Integer id);
    List<Reminder> findAllByUserId(Integer userId) ;



    //Reminder save(Reminder reminder);
}
