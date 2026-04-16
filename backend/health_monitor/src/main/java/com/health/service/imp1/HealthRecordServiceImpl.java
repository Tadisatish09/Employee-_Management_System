package com.health.service.imp1;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.health.entity.HealthRecord;
import com.health.repository.HealthRecordRepository;

@Service
public class HealthRecordServiceImpl  {

   @Autowired
   HealthRecordRepository healthrepo;
   

   
    public HealthRecord addRecord(HealthRecord record) {

        record.setRecordedAt(LocalDateTime.now());

        if (record.getHeartRate() > 120) {
            System.out.println("⚠ High Heart Rate Warning!");
        }

        return healthrepo.save(record);
    }

    
    public List<HealthRecord> getRecordsByUserId(Long userId) {
        return healthrepo.findByUserId(userId);
    }

    
    public HealthRecord getRecordById(Long id) {
        return healthrepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Record not found"));
    }

    
    public void deleteRecord(Long id) {
        healthrepo.deleteById(id);
    }
}