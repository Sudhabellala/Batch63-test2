package com.basic;

public class PatientAppointment {
	String hospitalName;
	String doctorName;
	String patientName;
	String openTime;
	String closeTime;
	int appointmentCount;
	
	void patientDetails() {

		hospitalName="Apollo";
		doctorName="Sudha";
		patientName="Kalyani";
		openTime="10 AM";
		closeTime="11 PM";
		appointmentCount=145;
		
	}
	
	void show() {
		System.out.println("Hospital Name: "+hospitalName);
		System.out.println("Doctor Name: "+doctorName);
		System.out.println("Patient Name: "+patientName);
		System.out.println("Open Time: "+openTime);
		System.out.println("Close Time: "+closeTime);
		System.out.println("Appointment Count: "+appointmentCount);
		
	}
	

	public static void main(String[] args) {
		PatientAppointment p=new PatientAppointment();
		p.patientDetails();
		p.show();
	}

}
