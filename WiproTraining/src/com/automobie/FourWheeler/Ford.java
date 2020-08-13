package com.automobie.FourWheeler;

import com.automobie.Vehical;

public class Ford extends Vehical
{
	public String modelName;
	public String ownerName;
	public String registrationNumber;
	public int speed;
	public int temperature;
	public Ford(String modelName, String ownerName, String registrationNumber, int speed, int temerature)
	{
		this.modelName = modelName;
		this.ownerName = ownerName;
		this.registrationNumber = registrationNumber;
		this.speed = speed;
		this.temperature = temerature;
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
	public int tempControl()
	{
		return temperature;
	}
}
