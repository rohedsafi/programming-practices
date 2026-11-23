package com.example.PracticeDB.repository;

import com.example.PracticeDB.model.Tasks;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepo extends JpaRepository<Tasks , Integer> {
//    @Transactional //
//    @Modifying(clearAutomatically = true)
//    @Query("UPDATE Tasks s SET s.taskTitle = :taskTitle WHERE s.taskId = :taskId")
//    void updateTitleById(@Param("taskId") int taskID ,@Param("taskTitle") String taskTitle);
}
