package com.assignments;

import java.util.Scanner;

public class LoginSystem {

	public static void main(String[] args) throws LoginBlockedException {
		int count=0;
		Scanner sc=new Scanner(System.in);
		
		try {
			for(int i=1;i<4;i++) {
				System.out.println("Enter your username: ");
				String userName=sc.next();
				System.out.println("Enter your password: ");
				String password=sc.next();
				System.out.println("**********************");
			
				if(userName.equals("sudharani") && password.equals("Sudha@123")) {
					System.out.println("Login Successfull");
					break;
				}
				else {
					count++;
				}
			}
			if(count==3) {
				throw new LoginBlockedException("Account blocked due to 3 failed login attempts.");
			}
		}finally {
			sc.close();
		}
	}
}
