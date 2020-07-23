package com.wipro.eb.entity;

public class Domestic extends Connection{
	public Domestic(int currentReading, int previousReading,float slabs[])
	{
		super(currentReading,previousReading,slabs);
	}
	public float computeBill()
	{
		float units = currentReading-previousReading;
		float billAmount=0;
		if(units<=50)
		{
		   billAmount=units*slabs[0];
		}
		else if(units<=100)
		{
		   billAmount=(50*slabs[0])+((units-50)*slabs[1]);
		}
		else
		{
		   billAmount=(50*slabs[0])+(50*slabs[1])+((units-100)*slabs[2]);
		}  
		  return billAmount;
	}
}
