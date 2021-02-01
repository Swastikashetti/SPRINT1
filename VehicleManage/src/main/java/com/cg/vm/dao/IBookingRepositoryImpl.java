package com.cg.vm.dao;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;

import com.cg.vm.bean.Booking;
import com.cg.vm.bean.Customer;
import com.cg.vm.bean.Vehicle;
import com.cg.vm.util.DBUtil;

public class IBookingRepositoryImpl implements IBookingRepository{
	DBUtil dbUtil = new DBUtil();
	/**
	 * create dbutil class object and create a entity manager from createEntityManager Function
	 */
	EntityManager entityManager = dbUtil.createEntityManager();
	

	@Override
	public Booking addBooking(Booking booking) {
		entityManager.getTransaction().begin();
		entityManager.persist(booking);
		entityManager.getTransaction().commit();
		return booking;	
	}

	@Override
	public Booking cancelBooking(Booking b) {
		// TODO Auto-generated method stub	
	entityManager.remove(b);
	entityManager.getTransaction().commit();
	return b;
	}

	@Override
	public Booking updateBooking(Booking b) {
		// TODO Auto-generated method stub
		entityManager.getTransaction().begin();
		return b ;
	}

	@Override
	public Booking viewBooking(Booking b) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public List<Booking> viewAllBooking(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Booking> viewAllBookingByDate(LocalDate bookingDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Booking> viewAllBookingByVehicle(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return null;
	}

}

