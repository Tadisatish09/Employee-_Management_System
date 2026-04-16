package com.health.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HealthRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    private int heartRate;
    private int systolicBp;
    private int diastolicBp;
    private double weight;

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public int getHeartRate() {
		return heartRate;
	}

	public void setHeartRate(int heartRate) {
		this.heartRate = heartRate;
	}

	public int getSystolicBp() {
		return systolicBp;
	}

	public void setSystolicBp(int systolicBp) {
		this.systolicBp = systolicBp;
	}

	public int getDiastolicBp() {
		return diastolicBp;
	}

	public void setDiastolicBp(int diastolicBp) {
		this.diastolicBp = diastolicBp;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public LocalDateTime getRecordedAt() {
		return recordedAt;
	}

	public void setRecordedAt(LocalDateTime recordedAt) {
		this.recordedAt = recordedAt;
	}

	private LocalDateTime recordedAt;
}