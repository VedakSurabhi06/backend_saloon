package com.example.demo.dao;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.AppoinmentEntity;
import com.example.demo.repository.AppointmentRepository;

@Repository
public class AppoinmentDAO {

	@Autowired
	private AppointmentRepository appointmentRepository;

//	@Autowired(required = true)
//	AppoinmentEntity ae;

	public AppoinmentEntity addAppoinment(String location, String visitType,LocalDate preferredDate, LocalTime preferredTime,String serviceName) {
		//return appointmentRepository.save(appointment);
		//return appointmentRepository.addAppoinment(ae.getLocation(),ae.getVisitType(),ae.getPreferredDate(), ae.)
		return appointmentRepository.addAppoinment(location, visitType, preferredDate, preferredTime, serviceName);
	}
	public AppoinmentEntity removeAppoinment(long appoinmentId) {
//		appointmentRepository.deleteById(appoinmentId);
//		return null;
		return appointmentRepository.removeAppoinment(appoinmentId);
	}
	public AppoinmentEntity updateAppoinment(long appoinmentId,String location, String visitType,LocalDate preferredDate, LocalTime preferredTime,String serviceName) {
	
		//return appointmentRepository.save(appointment);	
		return appointmentRepository.updateAppoinment(appoinmentId, location, visitType, preferredDate, preferredTime, serviceName);
	}
	
	public AppoinmentEntity getAppointment(long appoinmentId) {
		
		//return appointmentRepository.findById(appoinmentId).get();
		return appointmentRepository.getAppointment(appoinmentId);
		
	}
	
	public List<AppoinmentEntity> getAllAppoinments(){
		//return appointmentRepository.findAll();
		return appointmentRepository.getAllAppoinments();
		
	}
	public List<AppoinmentEntity> getOpenAppoinments(){
		return null;
		
	}
	
}
