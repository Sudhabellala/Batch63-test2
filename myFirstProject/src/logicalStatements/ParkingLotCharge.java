package logicalStatements;

import java.util.Scanner;

public class ParkingLotCharge {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of vehicles: ");
		int n=sc.nextInt();
		
		int totalCollection=0;
		for(int i=1;i<=n;i++) {
			System.out.println("Enter Vehicle Type (Car/Bike/Truck): ");
			String type=sc.next();
			
			System.out.println("Enter No.of Hours: ");
			int hours=sc.nextInt();
			
			int charge=0;
			
			switch(type.toLowerCase()) {
			case "car":
				charge=50*hours;
				break;
			case "bike":
				charge=20*hours;
				break;
			case "truck":
				charge=100*hours;
				break;
			default:
				System.out.println("Invalid Vehicle Type!");
				continue;
			}
			System.out.println("Charge for vehicle "+i+" "+type+": "+charge);
			totalCollection+=charge;	
		}
		System.out.println("Total collection: "+totalCollection);
		sc.close();
	}
}

