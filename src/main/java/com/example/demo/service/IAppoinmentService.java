package com.example.demo.service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import com.example.demo.entity.AppoinmentEntity;

public interface IAppoinmentService {
	//public AppoinmentEntity addAppoinment(AppoinmentEntity appointment);
	public AppoinmentEntity removeAppoinment(long appoinmentId);
	//
	//public AppoinmentEntity updateAppoinment(long appoinmentId,AppoinmentEntity appointment);
	public AppoinmentEntity getAppointment(long appoinmentId);
	
	public List<AppoinmentEntity> getAllAppoinments();
	public List<AppoinmentEntity> getOpenAppoinments();
	public AppoinmentEntity addAppoinment(String location, String visitType, LocalDate preferredDate, LocalTime preferredTime,
			String serviceName);
	public AppoinmentEntity updateAppoinment(long appoinmentId, String location, String visitType, LocalDate preferredDate,
			LocalTime preferredTime, String serviceName);
	
}
