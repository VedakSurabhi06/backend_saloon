package com.example.demo.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="appoinment")
public class AppoinmentEntity {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name="appoinmentId")
	private long appoinmentId;
	
	@Column(name="app_location")
	private String location;
	
	@Column(name="app_visit_type")
	private String visitType;
	
	@Column(name="app_preferred_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate preferredDate;
	
	@Column(name="app_preferred_time")
	private LocalTime preferredTime;
	
	@Column(name="app_service_name")
	private String serviceName;
	
	@ManyToOne
	CustomerEntity customer;
	@OneToOne
	PaymentEntity payment;
	


	
	
}
