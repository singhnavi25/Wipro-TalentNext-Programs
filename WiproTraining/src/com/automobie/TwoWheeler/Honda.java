package com.automobie.TwoWheeler;
import com.automobie.Vehical;
public class Honda extends Vehical
{

	public String modelName;
	public String ownerName;
	public String registrationNumber;
	public int speed;
	
	public Honda(String modelName, String ownerName, String registrationNumber, int speed)
	{
		this.modelName = modelName;
		this.ownerName = ownerName;
		this.registrationNumber = registrationNumber;
		this.speed = speed;
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
	
	public void cdplayer()
	{
		System.out.println("It provides cdplayer facility");
	}
}
