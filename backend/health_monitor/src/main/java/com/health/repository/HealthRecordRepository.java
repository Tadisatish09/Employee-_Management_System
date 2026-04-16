package com.health.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.health.entity.HealthRecord;

public interface HealthRecordRepository extends JpaRepository<HealthRecord, Long> {

    List<HealthRecord> findByUserId(Long userId);
}
