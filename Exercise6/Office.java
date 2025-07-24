package com.project.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Office")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Office {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private long id;
	@Column(name="officename")
	private String  officeName;
	@Column(name="location")
	private String location;
	@Column(name= "number")
	private int number;
	@Column(name="manager")
	private String manager;
		

}
