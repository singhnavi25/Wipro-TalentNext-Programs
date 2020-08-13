package com.automobie.FourWheeler;

import com.automobie.Vehical;

public class Logan extends Vehical 
{
	public String modelName;
	public String ownerName;
	public String registrationNumber;
	public int speed;
	public int gps;
	public Logan(String modelName, String ownerName, String registrationNumber, int speed, int gps)
	{
		this.modelName = modelName;
		this.ownerName = ownerName;
		this.registrationNumber = registrationNumber;
		this.speed = speed;
		this.gps = gps;
	}
	
	@Override
	public String getModelName() 
	{
		// TODO Auto-generated method stub
		return modelName;
	}

	@Override
	public String getRegistrationNumber() 
	{
		// TODO Auto-generated method stub
		return this.registrationNumber;
	}

	@Override
	public String getOwnerName() 
	{
		// TODO Auto-generated method stub
		return this.ownerName;
	}
	
	public int getSpeed()
	{
		return this.speed;
	}
	
	public int gps()
	{
		return gps;
	}
}
