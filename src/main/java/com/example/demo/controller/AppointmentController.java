package com.example.demo.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.AppoinmentEntity;
import com.example.demo.service.impl.AppoinmentService;

@RestController
public class AppointmentController {


	
	@Autowired
	private AppoinmentService appoinmentService;
	
	@PostMapping("/addAppoinment")
	public AppoinmentEntity addAppoinment(@RequestBody String location, String visitType,LocalDate preferredDate, LocalTime preferredTime,String serviceName) {
		return appoinmentService.addAppoinment(location, visitType, preferredDate, preferredTime, serviceName);	
	}
	
	@DeleteMapping("/removeAppoinment/{id}")
	public AppoinmentEntity removeAppoinment(@PathVariable("id")long  appoinmentId){
		return appoinmentService.removeAppoinment(appoinmentId);	
	}
	
	@PutMapping("/updateAppoinment/{id}")
	public AppoinmentEntity updateAppoinment(@PathVariable("id")long  appoinmentId,@RequestBody String location, String visitType,LocalDate preferredDate, LocalTime preferredTime,String serviceName){
		return appoinmentService.updateAppoinment(appoinmentId, location, visitType, preferredDate, preferredTime, serviceName);
	}
	
	@GetMapping("/getAppoinments/{id}")
	public AppoinmentEntity getAppointment(@PathVariable("id")long appoinmentId) {
		return appoinmentService.getAppointment(appoinmentId);	
	}
	
	@GetMapping("/getAllAppoinments")
	public List<AppoinmentEntity> getAllAppoinments(){
		 return appoinmentService.getAllAppoinments();
		
	}
	
	@GetMapping("/getOpenAppoinments")
	public List<AppoinmentEntity> getOpenAppoinments(){
		return appoinmentService.getOpenAppoinments();	
	}
	
	
}
