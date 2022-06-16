package com.example.demo.repository;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.AppoinmentEntity;

@Repository
public interface AppointmentRepository  extends JpaRepository<AppoinmentEntity, Long>{
	

	
	@Query(value = "INSERT INTO appoinment (app_location,app_visit_type,app_preferred_date,app_preferred_time,app_serviceName) VALUES (?1,?2,?3,?4,?5) ",nativeQuery=true)
	public AppoinmentEntity addAppoinment(String location, String visitType,LocalDate preferredDate, LocalTime preferredTime,String serviceName);
	
	@Query(value= "DELETE FROM appoinment a WHERE a.appoinment_id=?1",nativeQuery=true)
	public AppoinmentEntity removeAppoinment(long appoinmentId);
	
	@Query(value = "UPDATE appoinment a SET a.app_location=?2, a.app_visit_type=?3, a.app_preferred_date=?4, a.app_preferred_time=?5, a.app_service_name=?6  WHERE a.appoinmentId=?1",nativeQuery=true)
	public AppoinmentEntity updateAppoinment(long appoinmentId,String location, String visitType,LocalDate preferredDate, LocalTime preferredTime,String serviceName);
	
	@Query(value = "SELECT * FROM appoinment a WHERE a.appoinment_id=?1",nativeQuery=true)
	public AppoinmentEntity getAppointment(long appoinmentId);
	
	@Query(value = "SELECT * FROM appoinment",nativeQuery=true)
	public List<AppoinmentEntity> getAllAppoinments();
	
	@Query(value = "SELECT * FROM appoinment a WHERE a.app_visit_type='OPEN'",nativeQuery=true)
	public List<AppoinmentEntity> getOpenAppoinments();
}
