package com.cg.vm.dao;

import java.time.LocalDate;
import java.util.List;

import com.cg.vm.bean.*;

public interface IPaymentRepository {

	public Booking addPayment(Payment payment);
	public Booking cancelPayment(Payment p);
	public Booking viewPayment(Booking b);
	public List<Booking> viewAllPayments(Vehicle vehicle);
	public double calculateMonthlyRevenue(LocalDate d1,LocalDate d2);
	public double calculateTotalPayment(Vehicle v);
	
}
