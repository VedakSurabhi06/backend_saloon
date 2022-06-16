package com.example.demo.service.impl;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.AppoinmentDAO;
import com.example.demo.entity.AppoinmentEntity;
import com.example.demo.service.IAppoinmentService;

@Service
public class AppoinmentService implements IAppoinmentService {
    @Autowired
	private AppoinmentDAO appointmentDao;
	

	@Override
	public AppoinmentEntity addAppoinment(String location, String visitType,LocalDate preferredDate, LocalTime preferredTime,String serviceName) {
		
		return appointmentDao.addAppoinment(location, visitType, preferredDate, preferredTime, serviceName);
	}

	@Override
	public AppoinmentEntity removeAppoinment(long appoinmentId) {

		return appointmentDao.removeAppoinment(appoinmentId);
	}

	@Override
	public AppoinmentEntity updateAppoinment(long appoinmentId, String location, String visitType,LocalDate preferredDate, LocalTime preferredTime,String serviceName) {
		
		return appointmentDao.updateAppoinment(appoinmentId, location, visitType, preferredDate, preferredTime, serviceName);
	}

	@Override
	public AppoinmentEntity getAppointment(long appoinmentId) {
		
		return appointmentDao.getAppointment(appoinmentId);
	}

	@Override
	public List<AppoinmentEntity> getAllAppoinments() {
		
		return appointmentDao.getAllAppoinments();
	}

	@Override
	public List<AppoinmentEntity> getOpenAppoinments() {
		
		return appointmentDao.getOpenAppoinments();
	}

	

}
