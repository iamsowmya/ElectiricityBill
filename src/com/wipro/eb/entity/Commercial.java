package com.wipro.eb.entity;

public class Commercial extends Connection{
	public Commercial(int currentReading, int previousReading,float slabs[])
	{
		super(currentReading,previousReading,slabs);
	}
	public float computeBill()
	{
		float units=currentReading-previousReading;
		float bill;
		if(units<50)
			bill=units*slabs[0];
		else if(units<100)
			bill=(50*slabs[0])+((units-50)*slabs[1]);
		else
			bill=(50*slabs[0])+(50*slabs[1])+((units-100)*slabs[2]);
		double eleDuty;
		if(bill>=10000)
			eleDuty=bill*0.09;
		else if(bill>=5000)
			eleDuty=bill*0.06;
		else
			eleDuty=bill*0.02;
		return (float) (bill+eleDuty);
	}
}