package com.cg.vm.bean;

public class Vehicle {
private  int vehicleId;
private Driver driver;
private String vehicleNumber;
private String type;//car//bus
private String category ; //ac or nonac
private String description;
private String location;
private String capacity;
private double chargesPerKM;
private double fixedCharges;
public int getVehicleId() {
	return vehicleId;
}
public void setVehicleId(int vehicleId) {
	this.vehicleId = vehicleId;
}
public Driver getDriver() {
	return driver;
}
public void setDriver(Driver driver) {
	this.driver = driver;
}
public String getVehicleNumber() {
	return vehicleNumber;
}
public void setVehicleNumber(String vehicleNumber) {
	this.vehicleNumber = vehicleNumber;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getCapacity() {
	return capacity;
}
public void setCapacity(String capacity) {
	this.capacity = capacity;
}
public double getChargesPerKM() {
	return chargesPerKM;
}
public void setChargesPerKM(double chargesPerKM) {
	this.chargesPerKM = chargesPerKM;
}
public double getFixedCharges() {
	return fixedCharges;
}
public void setFixedCharges(double fixedCharges) {
	this.fixedCharges = fixedCharges;
}


}
