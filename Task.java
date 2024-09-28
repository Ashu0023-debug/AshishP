package com.example.demo;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Task {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name ="assignedby", nullable =  false)
	private String asby;
	@Column(name ="assignedto", nullable =  false)
	private String asto;
	@CreationTimestamp
	@Column(name ="task_created")
	private LocalDateTime tc;
	@UpdateTimestamp
	@Column(name ="task_done")
	private LocalDateTime td;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAsby() {
		return asby;
	}
	public void setAsby(String asby) {
		this.asby = asby;
	}
	public String getAsto() {
		return asto;
	}
	public void setAsto(String asto) {
		this.asto = asto;
	}
	public LocalDateTime getTc() {
		return tc;
	}
	public void setTc(LocalDateTime tc) {
		this.tc = tc;
	}
	public LocalDateTime getTd() {
		return td;
	}
	public void setTd(LocalDateTime td) {
		this.td = td;
	}

}
