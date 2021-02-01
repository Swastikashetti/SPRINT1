package com.cg.vm.dao;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;

import com.cg.vm.bean.Booking;
import com.cg.vm.bean.Payment;
import com.cg.vm.bean.Vehicle;
import com.cg.vm.util.DBUtil;

public class IPaymentRepositoryImpl implements IPaymentRepository{
	DBUtil dbUtil = new DBUtil();
	/**
	 * create dbutil class object and create a entity manager from createEntityManager Function
	 */
	EntityManager entityManager = dbUtil.createEntityManager();

	@Override
	public Booking addPayment(Payment payment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Booking cancelPayment(Payment p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Booking viewPayment(Booking b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Booking> viewAllPayments(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double calculateMonthlyRevenue(LocalDate d1, LocalDate d2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculateTotalPayment(Vehicle v) {
		// TODO Auto-generated method stub
		return 0;
	}

}
