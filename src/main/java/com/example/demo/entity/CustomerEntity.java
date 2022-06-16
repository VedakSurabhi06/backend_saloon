package com.example.demo.entity;

import java.time.*;
import java.util.List;

import javax.persistence.*;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class CustomerEntity {
	@Id
	private String userid;
	@Column(name="name")
	private String name;
	@Column(name="email")
	private String email; 
	@Column(name="contactNo")
	private String contactNo;
	@Column(name="dob")
	private LocalDate dob;
//	private Address adress;
//	@OneToMany
//	private List<Adress> adress1;
	@OneToMany
	private List<AppoinmentEntity> appointment;
//	@OneToMany
//	private List<Order> order;
	
}
