package com.gym.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name="cardio")
@Entity
public class Cardio {
	
@Id
private String code;
private String cycling;
private String running;
private Date date;

	

}
