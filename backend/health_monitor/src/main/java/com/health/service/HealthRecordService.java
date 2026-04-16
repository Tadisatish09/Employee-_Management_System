package com.health.service;

import java.util.List;

import com.health.entity.HealthRecord;

public interface HealthRecordService {

    HealthRecord addRecord(HealthRecord record);

    List<HealthRecord> getRecordsByUserId(Long userId);

    HealthRecord getRecordById(Long id);

    void deleteRecord(Long id);
}
